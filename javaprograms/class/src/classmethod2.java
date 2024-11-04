
public class classmethod2 {
	int i;
	int j;
	int count;
	void for2()
	{
		for(i=1;i<=100;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		if(count==2)
		{
			System.out.println(i);
		}
		
		}
	}

	public static void main(String[] args) {
		
		System.out.println("prime numbers between 1 and 100");
		classmethod2 p=new classmethod2();
		p.for2();
		

	}

}
