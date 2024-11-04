package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import advance.databaseconnection;

public class joinsQuerry {
	public void innerjoin()
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select s.sid,s.sname,s.sage,j.jid,j.couse,j.cduration,p.pid,p.pcourse,p.pduration from inst.std s inner join inst.java j inner join inst.python p on s.sid=j.fksid and s.sid=p.fksid;");
			
		
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("sid=="+rs.getInt("sid"));
			System.out.println("sname=="+rs.getString("sname"));
			System.out.println("sage=="+rs.getInt("sage"));
			System.out.println("java id=="+rs.getInt("jid"));
			System.out.println("java course=="+rs.getString("couse"));
			System.out.println("duration=="+rs.getInt("cduration"));
			System.out.println("pyhon id=="+rs.getInt("pid"));
			System.out.println("course=="+rs.getString("pcourse"));
			System.out.println("duration=="+rs.getInt("pduration"));
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void leftjoin()
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select s.sid,s.sname,s.sage,j.jid,j.couse,j.cduration from inst.std s left join inst.java j on s.sid=j.fksid;");
			
		
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("sid=="+rs.getInt("sid"));
			System.out.println("sname=="+rs.getString("sname"));
			System.out.println("sage=="+rs.getInt("sage"));
			System.out.println("java id=="+rs.getInt("jid"));
			System.out.println("java course=="+rs.getString("couse"));
			System.out.println("duration=="+rs.getInt("cduration"));
			//System.out.println("pyhon id=="+rs.getInt("pid"));
			//System.out.println("course=="+rs.getString("pcourse"));
			//System.out.println("duration=="+rs.getInt("pduration"));
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void rightjoin()
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select s.sid,s.sname,s.sage,j.jid,j.couse,j.cduration from inst.std s right join inst.java j on s.sid=j.fksid;");
			
		
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println("sid=="+rs.getInt("sid"));
			System.out.println("sname=="+rs.getString("sname"));
			System.out.println("sage=="+rs.getInt("sage"));
			System.out.println("java id=="+rs.getInt("jid"));
			System.out.println("java course=="+rs.getString("couse"));
			System.out.println("duration=="+rs.getInt("cduration"));
			//System.out.println("pyhon id=="+rs.getInt("pid"));
			//System.out.println("course=="+rs.getString("pcourse"));
			//System.out.println("duration=="+rs.getInt("pduration"));
		    	System.out.println("----------------------------------------------------");
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		
		joinsQuerry j=new joinsQuerry();
		//j.innerjoin();
		j.leftjoin();
		//j.rightjoin();
		}

}
