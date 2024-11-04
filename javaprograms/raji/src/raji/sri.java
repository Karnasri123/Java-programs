package raji;

public class sri {

	public static void main(String[] args) {
		System.out.println("prime numbers between 1 and 20 are==");
		double sum=0;int c=0;
		int i;
		for(i=1;i<=20;i++)
	     {
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
		if(count==2)
		{
	         c++;
	         System.out.println(i);
	         sum=sum+i;
		}
	     }
		System.out.println("total sum of prime numbers=="+sum);
		System.out.println("number of prime numers=="+c);
		double avg=sum/c;
		System.out.println("avg of prime numbers=="+avg);
	}

}
