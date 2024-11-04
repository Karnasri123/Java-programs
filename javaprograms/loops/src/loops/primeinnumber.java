package loops;

public class primeinnumber {

	public static void main(String[] args) {
		int n=143567;
		System.out.println("original given number=="+n);
		System.out.println("prime numbers present in original number are---");
		while(n>0)
		{
			int last=n%10;
			int count=0;
			for(int i=1;i<=last;i++)
			{
				if(last%i==0)
				{
					count++;
				}
			}
				if(count==2)
				{
				 System.out.println(last);
				}	
			
				
			n=n/10;
		}
		
		
	}

}
