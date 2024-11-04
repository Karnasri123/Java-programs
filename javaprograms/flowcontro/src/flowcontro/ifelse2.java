package flowcontro;

public class ifelse2 {

	public static void main(String[] args) {
		double bill=700;
		double percentage;
		if(bill<=100)
		{
			percentage=bill/100*10;
			bill=bill-percentage;
			System.out.println("bill=="+bill);
		}
		if(bill>100&&bill<=200)
		{
			percentage=bill/100*30;
			bill=bill-percentage;
			System.out.println("bill=="+bill);
		}
		if(bill>=200&&bill<=300)
		{
			percentage=bill/100*40;
			bill=bill-percentage;
			System.out.println("bill=="+bill);
		}
		if(bill>300&&bill<=400)
		{
			percentage=bill/100*50;
			bill=bill-percentage;
			System.out.println("bill=="+bill);
		}
		if(bill>400&&bill<=500)
		{
			percentage=bill/100*50;
			bill=bill-percentage;
			System.out.println("bill=="+bill);
		}
		
		else
		{
			percentage=bill/100*60;
			bill=bill-percentage;
			System.out.println("bill=="+bill);
		}
		
	}

}
