package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import advance.databaseconnection;

public class productdao {
	public void save(productpojo pd)
	{
		System.out.println("iamin emp controller class"+pd);
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("insert into product.productpojo values(?,?,?,?,?,?)");
			ps.setInt(1,pd.getPid());
			ps.setString(2,pd.getPname());
			ps.setDouble(3,pd.getPcost());
			ps.setString(4,pd.getPvendor());
			ps.setString(5,pd.getPcountry());
			ps.setString(6,pd.getPtype());
			int rows=ps.executeUpdate();
			System.out.println("rows inserted--"+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(double pcost ,String pvendor,int pid)
	{
		System.out.println("iamin update method");
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("update product.productpojo set pcost=?, pvendor=? where pid=?;");
			ps.setDouble(1,pcost);
			ps.setString(2,pvendor);
			ps.setInt(3,pid);
			int rows=ps.executeUpdate();
			System.out.println("rows updated--"+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(int pid)
	{
		System.out.println("iamin delete method");
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("delete from product.productpojo where pid=?;");
			
			ps.setInt(1,pid);
			int rows=ps.executeUpdate();
			System.out.println("rows deleted--"+rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getbyid(int pid)
	{
		Connection con=databaseconnection.getconnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from product.productpojo where pid=?;");
			
			ps.setInt(1,pid);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
			System.out.println(rs.getInt("pid"));
			System.out.println(rs.getString("pname"));
			System.out.println(rs.getDouble("pcost"));
			System.out.println(rs.getString("pvendor"));
			System.out.println(rs.getString("pcountry"));
			System.out.println(rs.getString("ptype"));
			
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
			PreparedStatement ps=con.prepareStatement("select * from product.productpojo;");
			
			
			ResultSet rs=ps.executeQuery();
			 while(rs.next())
			    {
				 System.out.println(rs.getInt("pid"));
					System.out.println(rs.getString("pname"));
					System.out.println(rs.getDouble("pcost"));
					System.out.println(rs.getString("pvendor"));
					System.out.println(rs.getString("pcountry"));
					System.out.println(rs.getString("ptype"));
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
