package exceptionhandling;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class filereadwithfor {
	public void getdata(String squal)
	{
		
	String path="E:\\file reader\\New Text Document.txt";
	FileReader fr= null;
	BufferedReader br=null;
	try
	{
		fr=new FileReader(path);
		br=new BufferedReader(fr);
		for(String s=br.readLine();s!=null;s=br.readLine())
		{
			String[] data=s.split(",");
			if(squal.equals(data[4])) {
			student std=new student();
			std.setSid(Integer.valueOf(data[0]));
			std.setSname(data[1]);
			std.setSage(Integer.valueOf(data[2]));
			std.setSmarks(Double.valueOf(data[3]));
			std.setSqual(data[4]);
		    System.out.println(std.getSid());
			System.out.println(std.getSname());
			System.out.println(std.getSage());
			System.out.println(std.getSmarks());
			System.out.println(std.getSqual());
			System.out.println("-----------------------------------------------");
			}
			
			
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public static void main(String[] args) {
		filereadwithfor a=new filereadwithfor();
		a.getdata("mca");
		
		}

}
