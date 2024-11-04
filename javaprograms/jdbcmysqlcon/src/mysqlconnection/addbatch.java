package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class addbatch {
	public void insertdata()
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/school","root","Root@123");
		PreparedStatement ps=con.prepareStatement("insert into school.student(sid,sname,sage,smarks,sloc) values(?,?,?,?,?)");
		ps.setInt(1,10);
		ps.setString(2,"amma");
		ps.setInt(3,46);
		ps.setDouble(4,98.8);
		ps.setString(5,"chinthal");
		ps.addBatch();
		ps.setInt(1,11);
		ps.setString(2,"nanna");
		ps.setInt(3,56);
		ps.setDouble(4,99.8);
		ps.setString(5,"chinthal");
		ps.addBatch();
		ps.setInt(1,12);
		ps.setString(2,"bro");
		ps.setInt(3,26);
		ps.setDouble(4,88.8);
		ps.setString(5,"kadapa");
		ps.addBatch();
		ps.setInt(1,14);
		ps.setString(2,"sriranga");
		ps.setInt(3,66);
		ps.setDouble(4,68.8);
		ps.setString(5,"rampur");
		ps.addBatch();
		 ps.executeBatch();
		System.out.println("rows updated----");
	} catch (ClassNotFoundException e) {
		
		System.out.println("given class is wrong--"+e);
	}catch(Exception e)
	{
		System.out.println("connection failed wrong---"+e);
	}
	}
	public static void main(String[] args) {
		
         addbatch a=new addbatch();
         a.insertdata();
	}

}
