package subquiries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class ontoone {
	public void getpassdetail(int pid)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.passport p where fkpid=(select r.pid from relation.person r where r.pid=?);\r\n"
					+ "");
			ps.setInt(1, pid);
		//System.out.println("person details");
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
	public void getpersondetail(int passnum)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from relation.person r where r.pid=(select p.fkpid from relation.passport p where p.passnum=?)");
			ps.setInt(1, passnum);
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ontoone o=new ontoone();
		//o.getpassdetail(2);
		o.getpersondetail(2436);
	}

}
