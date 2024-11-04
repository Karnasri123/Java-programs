import java.io.File;

public class filepath {

	public static void main(String[] args) {
		String spath="D:";
		File F= new File(spath);
		/*System.out.println(F.exists());
		System.out.println(F.getAbsolutePath());
		System.out.println(F.getName());
		System.out.println(F.getParent());
		System.out.println(F.canRead());
		System.out.println(F.canWrite());
		System.out.println(F.getUsableSpace());
		System.out.println(F.getFreeSpace());*/
		System.out.println("--------------------------------------------");
		File[] data=F.listFiles();
		for(int i=0;i<=data.length-1;i++)
		{
			if(data[i].isDirectory())
			{
				System.out.println(data[i]+" "+data[i].isDirectory());
				File[] fname=F.listFiles();
				{
					for(int j=0;j<=fname.length-1;j++)
					{
						System.out.println(fname[j]);
					}
				}
			}
		}
		
	}
		
		
		
	

}
