package loops;

public class pattern10 {

	public static void main(String[] args) {

                int i,j;
                for(i=1;i<=5;i++)
           	 {
           		 for(j=2;j<=i;j++)
           		 {
           			 System.out.print(" ");
           		
           		 }
           		System.out.print("*");
      
           	 System.out.println();
           	 }
                for(i=1;i<=5;i++)
        		{
        			for(j=0;j<5-i;j++)
        			{
        				System.out.print(" ");
        			}
        		System.out.print("*");
        		System.out.println();
        		
           	 }
	}

}
