package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class employeedao {
	
	// dao insert the data in database
	public void save(employee emp)
	{
		System.out.println("iam in employeedao class"+emp);
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("insert into company.employee values(?,?,?,?,?)");
			ps.setInt(1,emp.getEid());
			ps.setString(2,emp.getEname());
			ps.setDouble(3,emp.getEsal());
			ps.setString(4,emp.getEdesg());
			ps.setString(5,emp.getEloc());
			int rows=ps.executeUpdate();
			System.out.println("rows inserted--"+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(String eloc,String edesg,int eid)
	{
		System.out.println("iamin update method");
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("update company.employee set eloc=?, edesg=? where eid=?;");
			ps.setString(1,eloc);
			ps.setString(2,edesg);
			ps.setInt(3,eid);
			int rows=ps.executeUpdate();
			System.out.println("rows updated--"+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(int eid)
	{
		System.out.println("iamin delete method");
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("delete from company.employee where eid=?;");
			
			ps.setInt(1,eid);
			int rows=ps.executeUpdate();
			System.out.println("rows deleted--"+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getbyid(int eid)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from company.employee where eid=?;");
			
			ps.setInt(1,eid);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("esal"));
			System.out.println(rs.getString("edesg"));
			System.out.println(rs.getString("eloc"));
			
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getall()
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from company.employee;");
			
			
			ResultSet rs=ps.executeQuery();
			 while(rs.next())
			    {
				System.out.println(rs.getInt("eid"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getDouble("esal"));
				System.out.println(rs.getString("edesg"));
				System.out.println(rs.getString("eloc"));
				System.out.println("------------------------");
			    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public static void main(String[] args) {
		

	}

}
