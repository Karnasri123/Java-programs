package loops;
import java.util.*;
import java.math.*;
public class armstrongnumber {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			int digit=0;
			int last=0;
			int sum=0;
			int n=i;;
			while(n>0)
			{
				n=n/10;
				digit++;
			}
			n=i;
			while(n>0)
			{
				last=n%10;
				int k=(int)Math.pow(last,digit);
				sum=sum+k;
				n=n/10;
				
			}
		if(sum==i)
		{
			System.out.print(i+",");
		}

}
}}

	
