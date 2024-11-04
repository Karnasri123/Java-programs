package loops;

public class alternateprime {

	public static void main(String[] args) {
		int count=0;
		int d=0;
		double sum=0;
		int e=0;
		System.out.println("alternate prime numbers b/w 1 and 100 are");
		for (int i=1;i<=100;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;//to count number of factors for  a i value
					
				}}
				if(count==2) 
				{
					d++;//to count number of prime numbers
					if(d%2==1)
					{
						e++;//to count number of alternate prime numbers
						System.out.print(i+",");
						sum=sum+i;
					}
				}
			
				}
		System.out.println();
		//System.out.println("number of prime numbers=="+d);
		System.out.println("number of alternate prime numbers=="+e);
		System.out.println("sum of alternate prime numbers=="+sum);
		double avg=sum/e;
		System.out.println("avg of given numbers==="+avg);
		
			
		}
		

}
