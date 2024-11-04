package relations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class manytomany {
	public void getpersondetails(String cname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.course c inner join relation.pcdata pc where c.cname=? and p.pid=pc.fkppid and pc.fkccid=c.cid;");
			ps.setString(1,cname);
		System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));
			/*System.out.println("cid=="+rs.getInt("cid"));
			System.out.println("cname=="+rs.getString("cname"));
			System.out.println("cfee=="+rs.getInt("cfee"));*/
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getcoursedetails(String pname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.course c inner join relation.pcdata pc where p.pname=? and p.pid=pc.fkppid and pc.fkccid=c.cid;");
			ps.setString(1,pname);
		System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			/*System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));*/
			System.out.println("cid=="+rs.getInt("cid"));
			System.out.println("cname=="+rs.getString("cname"));
			System.out.println("cfee=="+rs.getInt("cfee"));
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
           manytomany mm=new manytomany();
           //mm.getpersondetails("aws");
           mm.getcoursedetails("sri");
	}

}
