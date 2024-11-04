package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class splitString {

	public static void main(String[] args) {
		String path="E:\\file reader\\New Text Document.txt";
		try
		{
		FileReader fr= new FileReader(path);
		
		BufferedReader br = new BufferedReader(fr);
		for(String s=br.readLine();s!=null;s=br.readLine())
		{
			String[] data=s.split(",");
			System.out.println("sid--"+data[0]);
			System.out.println("sname--"+data[1]);
			System.out.println("sage--"+data[2]);
			System.out.println("smarks--"+data[3]);
			System.out.println("squal--"+data[4]);
			
			System.out.println("-----------------------------------------------");
			
			
		}
		
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(IOException e)
		{
			System.out.println(e);
			}

	}

}
