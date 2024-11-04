package flowcontro;

public class ifelse {

	public static void main(String[] args) {
		double bill=101;
		double  disbill1=bill-(bill*10/100);
		double disbill2=bill-(bill*20/100);
		if(bill<=100)
		{
			System.out.println("bill=="+disbill1);
		}
		else
		{
			System.out.println("bill=="+disbill2);
		}
	}

}
