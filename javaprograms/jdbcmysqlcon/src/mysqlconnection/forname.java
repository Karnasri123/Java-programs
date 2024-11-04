package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class forname {

	public static void main(String[] args) {
		//driver manager takes url,username and password to connect mysql
		// step2 DriverManager is class calling static get connection method.
		// if url user pwd remains correct than it writtens connection object---ConnectionImpl
		// connection is a interface it has statements called as coral services below are
		//Statement CreateStatement(static)/PrepareStatement(dynamic)/CallableStatement
		// Statement is a interface again it contains executeQureey and executeUpdate methods
		//executeUpdate method----for inserting data,updating data,and deletion
		//executeQuerry method---for selection purpose(getting data).
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/school","root","Root@123");
			System.out.println(con);
			Statement st=con.createStatement();
			int row = st.executeUpdate("insert into school.student(sid,sname,sage,smarks,sloc) values(2,'ram',27,97.9,'hyd')");
			System.out.println("rows updated----"+row);
		} catch (ClassNotFoundException e) {
			
			System.out.println("given class is wrong--"+e);
		}catch(Exception e)
		{
			System.out.println("connection failed wrong---"+e);
		}

	}

}
