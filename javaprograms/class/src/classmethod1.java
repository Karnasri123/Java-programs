
public class classmethod1 {
	int i=1;
	int j;
	void forl()
	{
		for(i=1;i<=10;i++)
		{
		System.out.println(" table====="+i);
		for(j=1;j<=10;j++)
		{
			System.out.println(i+"*"+j+"="+(i*j));
			//System.out.print("*");
		}
		//System.out.println();
		}
		
	}

	public static void main(String[] args) {
		classmethod1 c=new classmethod1();
		c.forl();
		
		

	}

}
