package loops;

public class fib {

	public static void main(String[] args) {
		int a=1,b=2,x=a+b,i,n=5;
		for(i=1;i<=n;i++)
		{
	    System.out.println(x);
		a=b;
		b=x;
		x=a+b;
		}
		
		
	}

}
