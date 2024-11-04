package relations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class onetoone {
	public void getpassdetails(String pname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.passport t where p.pname=? and p.pid=t.fkpid;");
			ps.setString(1, pname);
		System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			//System.out.println("pid=="+rs.getInt("pid"));
			//System.out.println("pname=="+rs.getString("pname"));
			//System.out.println("page=="+rs.getInt("page"));
			System.out.println("passbook id=="+rs.getInt("passid"));
			System.out.println("passbook num=="+rs.getString("passnum"));
			System.out.println("passbook expire date=="+rs.getInt("pexpdt"));
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getpersondetails(int passnum)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.passport t where t.passnum=? and p.pid=t.fkpid;");
			ps.setInt(1, passnum);
		System.out.println("person details");
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
	
	
	public static void main(String[] args) {
		
       onetoone o=new onetoone();
     // o.getpassdetails("ram");
       o.getpersondetails(2436);
     
	}

}
