package subquiries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class subqueriesononetomany {
	public void getpersondetail(String msim)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person r where r.pid in(select fkmpid from relation.mobile where msim=?)");
			ps.setString(1, msim);
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
	public void getmobileetail(String pname)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.mobile where fkmpid=(select pid from relation.person where pname=?)");
			ps.setString(1, pname);
		//System.out.println("person details");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			/*System.out.println("pid=="+rs.getInt("pid"));
			System.out.println("pname=="+rs.getString("pname"));
			System.out.println("page=="+rs.getInt("page"));*/
			System.out.println("mobile id=="+rs.getInt("mid"));
			System.out.println("mobil num=="+rs.getInt("mnum"));
			System.out.println("msim=="+rs.getString("msim"));
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public static void main(String[] args) {
		
		subqueriesononetomany s=new subqueriesononetomany();
		//s.getpersondetail("hanuma");
		s.getmobileetail("ranga");
	}

}
