package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class sample1 {

	public static void main(String[] args) {
		
	//step 1  Class itself is a class
		//forName ---static method in class ---throws class not found exception
		//It loads the given class and executes static blocks
		
				try {
					Class dat= Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println(dat);
					
					//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3037/school","root","Root@123");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	

	}

}
