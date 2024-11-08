package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class dbconnect {
	public void saveindb(List<studentpojo> data)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/school","root","Root@123");
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("insert into school.studentpojo(sid,sname,sage,smarks,scourse) values(?,?,?,?,?)");
			for(studentpojo a:data)
			{
				ps.setInt(1, a.getSid());
				ps.setString(2, a.getSname());
				ps.setInt(3, a.getSage());
				ps.setDouble(4, a.getSmarks());
				ps.setString(5, a.getScourse());
				ps.executeUpdate();
			}
			
			System.out.println("rows updated----");
		} catch (ClassNotFoundException e) {
			
			System.out.println("given class is wrong--"+e);
		}catch(Exception e)
		{
			System.out.println("connection failed wrong---"+e);
		}
		
	}

	public static void main(String[] args) {
		
		dbconnect d=new dbconnect();
		stdcontroller c= new stdcontroller();
		List<studentpojo> d2=c.readdata("E:\\file reader\\studentpojo.txt");
		if(d2 !=null && !d2.isEmpty())
		{
			d.saveindb(d2);
		}else
		{
			System.out.println("No data to insert");
		}
	}

}
