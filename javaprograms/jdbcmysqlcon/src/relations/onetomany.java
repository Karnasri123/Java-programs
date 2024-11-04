package relations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class onetomany {
	public void getmobiledetails(String pname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.mobile t where p.pname=? and p.pid=t.fkmpid;");
			ps.setString(1,pname);
		System.out.println("mobile details");
		System.out.println("----------------------------------------------");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			//System.out.println("pid=="+rs.getInt("pid"));
			//System.out.println("pname=="+rs.getString("pname"));
			//System.out.println("page=="+rs.getInt("page"));
			System.out.println("mobile id=="+rs.getInt("mid"));
			System.out.println("mobile num=="+rs.getInt("mnum"));
			System.out.println("mobile sim=="+rs.getString("msim"));
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getpersondetails(int mnum)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.mobile t where t.mnum=? and p.pid=t.fkmpid;");
			ps.setInt(1,mnum);
		System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));
			/*System.out.println("mobile id=="+rs.getInt("mid"));
			System.out.println("mobile num=="+rs.getInt("mnum"));
			System.out.println("mobile sim=="+rs.getString("msim"));*/
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void gotpersondetails(String msim)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person p inner join relation.mobile t where t.msim=? and p.pid=t.fkmpid;");
			ps.setString(1,msim);
		System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));
			/*System.out.println("mobile id=="+rs.getInt("mid"));
			System.out.println("mobile num=="+rs.getInt("mnum"));
			System.out.println("mobile sim=="+rs.getString("msim"));*/
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		onetomany m=new onetomany();
		//m.getmobiledetails("sri");
		//m.getpersondetails(54674);
		m.gotpersondetails("aitel");

	}

}
