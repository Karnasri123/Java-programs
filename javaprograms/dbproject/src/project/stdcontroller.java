package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class stdcontroller {
	public List<studentpojo> readdata(String filepath)
	{
		List<studentpojo> student=new ArrayList();
		try {
			FileReader fr= new FileReader(filepath);
		    BufferedReader br=new BufferedReader(fr);
		    for(String sd=br.readLine();sd!=null;sd=br.readLine())
			{
				String data[]=sd.split(",");
				studentpojo a=new studentpojo();
				if(data.length==5)
				{
				a.setSid(Integer.valueOf(data[0]));
				a.setSname(data[1]);
				a.setSage(Integer.valueOf(data[2]));
				a.setSmarks(Double.valueOf(data[3]));
				a.setScourse(data[4]);
				
				
			      System.out.println(a.getSid());
			      System.out.println(a.getSname());
			      System.out.println(a.getSage());
			      System.out.println(a.getSmarks());
			      System.out.println(a.getScourse());
			      System.out.println("-----------------------------------");
			      student.add(a);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	public static void main(String[] args) {
		
	/*List<studentpojo> s=new ArrayList();
	s.add(new studentpojo(1,"sri",24,67.8,"mca"));
	s.add(new studentpojo(2,"ram",27,97.8,"mba"));
	s.add(new studentpojo(3,"hanuma",22,87.8,"ca"));
	s.add(new studentpojo(4,"laxman",21,77.8,"cma"));*/
		
		
	
	}

}