package loops;

public class gcd {

	public static void main(String[] args) {
		int n1=10,n2=20,i;
		int gcd=1;
		for(i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&&n2%i==0)
				gcd=i;
			
		}
		System.out.println(gcd);
		
	}

}
