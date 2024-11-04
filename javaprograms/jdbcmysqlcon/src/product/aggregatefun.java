package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class aggregatefun {
	public void aggregates()
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select sname,sum(sage) as sumsage,count(*) as countstd,max(sage) as maxsage,min(sage) as minsage,avg(sage) as avgsage from inst.std group by sname;");
			
		
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		    System.out.println("std name=="+rs.getString("sname"));	
			System.out.println("sum of ages=="+rs.getInt("sumsage"));
			System.out.println("no. of std=="+rs.getInt("countstd"));
			System.out.println("maximum age=="+rs.getInt("maxsage"));
			System.out.println("minimum age=="+rs.getInt("minsage"));
			System.out.println("avg of std age=="+rs.getDouble("avgsage"));
			
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		aggregatefun a=new aggregatefun ();
		a.aggregates();

	}

}
