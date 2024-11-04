package flowcontro;

public class forloop1 {

	public static void main(String[] args) {
		for(int i=1;i<=12;i++)
		{
			System.out.println("hours======================"+i);
			for(int j=1;j<=60;j++)
			{
				System.out.println("minutes==========="+j);
				for(int k=1;k<=60;k++)
				{
					System.out.println("seconds======"+k);
				}
			}
		}

	}

}
