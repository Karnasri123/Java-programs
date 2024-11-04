package loops;

public class numberreversing {
	public static void m1()
	{int n=143567;
		int last=0;
		int digits=0;
		System.out.println("original number=="+n);
		System.out.println("in reverse form");
		while(n>0)
		{
			last=n%10;
			digits++;
			System.out.print(last);
			n=n/10;
			
		}
		System.out.println();
		System.out.println("number of digits in a given number======="+digits);
		System.out.println("enter number==="+n);
		
		
		
	}

	public static void main(String[] args) {
		m1();
		
	}

}
