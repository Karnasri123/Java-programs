package filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class file {
	public void write(studentpojo a)
	{
		String path="E:\\file reader\\New Text Document.txt";
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw= new FileWriter(path);
			bw= new BufferedWriter(fw);
			String sd=a.getSid()+","+a.getSname()+","+a.getSage()+","+a.getSmarks()+","+a.getSqual();
			bw.write(sd);
			bw.newLine();
			bw.flush();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		

	}

}
