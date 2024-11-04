package loops;

public class alternateeven {

	public static void main(String[] args) {
		int c=0;
		int sum=0;
		int d=0;
		System.out.println("alternate numbers b/w 1 and 20 are");
	for(int i=1;i<=20;i++)
	{

		if(i%2==0)
		{
			c++;
			if(c%2==1)
			{
				d++;
				System.out.print(i+" ,");
				sum=sum+i;
				//System.out.println("d values");
				//System.out.println(d);
				
		}
	
		
	}
	}
	System.out.println();
	System.out.println("number of alternate numbers=="+d);
	System.out.println("sum of numbers=="+sum);
	double avg=sum/d;//average of alternate even numbers.
	System.out.println("avg of given numbers==="+avg);
	
	}

}
