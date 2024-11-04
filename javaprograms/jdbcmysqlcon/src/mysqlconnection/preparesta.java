package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class preparesta {
	public void insertdata(int sid,String sname,int sage,double smarks,String sloc)
	{
	a
	public void updatedata(String sloc,String sname,int sid)
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/school","root","Root@123");
		System.out.println(con);
		PreparedStatement ps=con.prepareStatement("update school.student set sloc=?,sname=? where sid=?;");
		ps.setString(1,sloc);
		ps.setString(2,sname);
		ps.setInt(3,sid);
		int row = ps.executeUpdate();
		System.out.println("rows updated----"+row);
	} catch (ClassNotFoundException e) {
		
		System.out.println("given class is wrong--"+e);
	}catch(Exception e)
	{
		System.out.println("connection failed wrong---"+e);
	}
	}
	public void deletedata(int sid)
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/school","root","Root@123");
		System.out.println(con);
		PreparedStatement ps=con.prepareStatement("delete from school.student where sid=?;");
		
		ps.setInt(1,sid);
		int row = ps.executeUpdate();
		System.out.println("rows updated----"+row);
	} catch (ClassNotFoundException e) {
		
		System.out.println("given class is wrong--"+e);
	}catch(Exception e)
	{
		System.out.println("connection failed wrong---"+e);
	}
	}


	public static void main(String[] args) {
		
		//System.out.println("started-----");
		//preparesta s= new preparesta();
		//s.insertdata(8,"aruna", 28, 71.7, "mydukur");
		//s.updatedata("america","sriraji",3);
		//s.deletedata(6);
		System.out.println("ended-----");
	}

}
