import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class rilereader {

	public static void main(String[] args) {
		String path="E:\\\\file reader\\\\New Text Document.txt";
		try{
		FileReader fr= new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		for(String s=br.readLine();s!=null;s=br.readLine())
		{
			String[] a=s.split(",");
			if(a[3]=="mca")
			{
				System.out.println(br.readLine());
			}else if(a[4]=="mca")
			{
				System.out.println(br.readLine());
			}
			else
			{
				System.out.println(br.readLine());
			}
		}
		
		}catch(FileNotFoundException e)
		{
			System.out.println("file catch--"+e);
		}catch(IOException e)
		{
			System.out.println("IO exception--"+e);
		}
	}

}
