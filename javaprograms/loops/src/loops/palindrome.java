package loops;

public class palindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=34543;
		temp=34543;
		while(n>0)
		{
			System.out.println("process steps");
			r=n%10;
			System.out.println("remainder="+r);
			sum=(sum*10)+r;
			System.out.println("sum="+sum);
			n=n/10;
			System.out.println("number==="+n);
			System.out.println();
		}
		if(temp==sum)
		{
			System.out.println("palindrome number=="+sum);
		}
		else
		{
			System.out.println("not a palyndrome");
		}


	}

}