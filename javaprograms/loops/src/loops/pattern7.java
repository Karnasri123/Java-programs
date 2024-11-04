package loops;

public class pattern7 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=1;j--)
			{
			if(i<j)
			{	
			System.out.print(" ");
			}
			else
				{
				System.out.print("* ");
				}
				}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=2;j<=i;j++)
			{
			System.out.print(" ");
			}
		    for(k=5;k>=i;k--)
				{
				System.out.print("* ");
				}
			System.out.println();
			}

	}

}
