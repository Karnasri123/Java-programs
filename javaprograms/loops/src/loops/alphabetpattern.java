package loops;

public class alphabetpattern {
	public static void pattern1()
	{
		for (int i=1;i<=7;i++)
		{
			for (int j=1;j<=7;j++)
			{
				if(j==7||i==4||j==1||i==1)
				{
					System.out.print( " *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pat()
	{
		for (int i=1;i<=7;i++)
		{
		for (int j=1;j<=7;j++)
		{
			if(j==7||j==4||j==1||i==1)
			{
				System.out.print( " *");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern1();
		System.out.println();
		pat();
		System.out.println();
		pat();
		System.out.println();
		pattern1();
		


}}