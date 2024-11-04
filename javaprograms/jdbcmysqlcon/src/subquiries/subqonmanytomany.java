package subquiries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class subqonmanytomany {
	public void getpersondetail(String cname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person where\r\n"
					+ " pid in (select fkppid from relation.pcdata where \r\n"
					+ " fkccid=(select cid from relation.course where cname=?));");
			ps.setString(1, cname);
		//System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));
			/*System.out.println("passbook id=="+rs.getInt("passid"));
			System.out.println("passbook num=="+rs.getString("passnum"));
			System.out.println("passbook expire date=="+rs.getInt("pexpdt"));*/
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getcoursedetail(String pname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.course where\r\n"
					+ " cid in (select fkccid from relation.pcdata where \r\n"
					+ " fkppid=(select pid from relation.person where pname=?));");
			ps.setString(1, pname);
		//System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			/*System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));*/
			System.out.println(" courseid=="+rs.getInt("cid"));
			System.out.println("course name=="+rs.getString("cname"));
			System.out.println("course fee=="+rs.getInt("cfee"));
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		
		subqonmanytomany y=new subqonmanytomany();
		//y.getpersondetail("aws");
		y.getcoursedetail("ram");
	}

}
