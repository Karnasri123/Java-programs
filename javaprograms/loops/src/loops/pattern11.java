package loops;

public class pattern11 {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("Nanna  ");
					
				}
				else
				{
					System.out.print("       ");
				}
			}
			System.out.println();
			System.out.println();
		}

	}

}
