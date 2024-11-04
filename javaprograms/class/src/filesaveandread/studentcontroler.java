package filesaveandread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class studentcontroler {
	public void save(student s)
	{
		System.out.println("your data is saved in file");
		String path="E:\\file reader\\New Text Document.txt";
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw= new FileWriter(path,true);
			bw= new BufferedWriter(fw);
			String sd=s.getSid()+","+s.getSname()+","+s.getSage()+","+s.getSmarks()+","+s.getSqual();
			bw.write(sd);
			bw.newLine();
			bw.flush();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void getbyid(int sid)
	{
		System.out.println("data read by id");
		
			String path="E:\\file reader\\New Text Document.txt";
			FileReader fr=null;
			BufferedReader br=null;
			try
			{
				fr= new FileReader(path);
				br= new BufferedReader(fr);
				for(String sd=br.readLine();sd!=null;sd=br.readLine())
				{
					String data[]=sd.split(",");
					if(sid==Integer.valueOf(data[0].trim()))
					{
				      System.out.println(data[0]);
				      System.out.println(data[1]);
				      System.out.println(data[2]);
				      System.out.println(data[3]);
				      System.out.println(data[4]);
					}
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		
		
	}
	public void getbyname(String sname)
	{
		System.out.println("data read by name");
		String path="E:\\file reader\\New Text Document.txt";
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr= new FileReader(path);
			br= new BufferedReader(fr);
			
			for(String sd=br.readLine();sd!=null;sd=br.readLine())
			{
				String data[]=sd.split(",");
				if(sname.equals(data[1]))
				{
			      System.out.println(data[0]);
			      System.out.println(data[1]);
			      System.out.println(data[2]);
			      System.out.println(data[3]);
			      System.out.println(data[4]);
				}
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void getall()
	{
		System.out.println("all data read");
		String path="E:\\file reader\\New Text Document.txt";
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr= new FileReader(path);
			br= new BufferedReader(fr);
			for(String sd=br.readLine();sd!=null;sd=br.readLine())
			{
				String[] d=sd.split(",");
				System.out.println(d[0]);
				System.out.println(d[1]);
				System.out.println(d[2]);
				System.out.println(d[3]);
				System.out.println(d[4]);
				System.out.println("-------------------------------------");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
		public boolean getbyid1(int sid)
		{
			boolean flag=true;
			String path="E:\\file reader\\New Text Document.txt";
			FileReader fr=null;
			BufferedReader br=null;
			try
			{
				fr= new FileReader(path);
				br= new BufferedReader(fr);
				for(String sd=br.readLine();sd!=null;sd=br.readLine())
				{
					String data[]=sd.split(",");
					if(sid==Integer.valueOf(data[0].trim()))
					{
				      flag=false;
					}
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			return flag;
		}
	
	

	public static void main(String[] args) {
		

	}

}
