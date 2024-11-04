package project2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import project.studentpojo;

public class empcontroller {
	public List<employeepojo> readdata(String path)
	{
		List<employeepojo> emp=new ArrayList();
		try {
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			for(String s=br.readLine();s!=null;s=br.readLine())
			{
				employeepojo e=new employeepojo();
				String data[]=s.split(",");
				e.setEid(Integer.valueOf(data[0]));
				e.setEname(data[1]);
				e.setEage(Integer.valueOf(data[2]));
				e.setEsal(Double.valueOf(data[3]));
				e.setEloc(data[4]);
				emp.add(e);
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	public void saveindb(List<employeepojo> db)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/school","root","Root@123");
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("insert into school.employee values(?,?,?,?,?)");
			for(employeepojo a:db)
			{
				ps.setInt(1, a.getEid());
				ps.setString(2, a.getEname());
				ps.setInt(3, a.getEage());
				ps.setDouble(4, a.getEsal());
				ps.setString(5, a.getEloc());
				ps.addBatch();
			}
			int[] rows=ps.executeBatch();
			
			System.out.println("rows updated----"+rows);
		} catch (ClassNotFoundException e) {
			
			System.out.println("given class is wrong--"+e);
		}catch(Exception e)
		{
			System.out.println("connection failed wrong---"+e);
		}
		
	}
	public static void main(String[] args) {
		empcontroller c=new empcontroller();
		//c.readdata("E:\\file reader\\employeedetails.txt");
		List<employeepojo>db=c.readdata("E:\\file reader\\employeedetails.txt");
         c.saveindb(db);
	}

}
