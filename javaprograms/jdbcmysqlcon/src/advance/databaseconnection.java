package advance;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseconnection {
	public static Connection getconnect()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/relation","root","Root@123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
