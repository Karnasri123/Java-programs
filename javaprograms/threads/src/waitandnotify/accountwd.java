package waitandnotify;

public class accountwd  {
	public static double balance=7000;
	
	public synchronized void withdraw(int wtd)
	{
		if(wtd<=balance)
		{
			System.out.println("---------iam in withdrawl---------"+wtd);
			balance=balance-wtd;
			System.out.println("balance after withdraw-----"+balance);
		}
		else
		{
			System.out.println("-----insufficient funds try after sometime");
		}	
	}
	public synchronized void deposit(int dpt)
	{
		System.out.println("--------iam in deposit----"+dpt);
			balance=balance+dpt;
			System.out.println("balance after deposit-----"+balance);	
	}

	public static void main(String[] args) {
		accountwd a=new accountwd();
		System.out.println("available balance---------------------"+a.balance);
		Thread t=new Thread() {
			public void run()
			{
				a.withdraw(4000);
			
		}};
		t.start();
		Thread t1=new Thread() {
			public void run()
			{
				a.deposit(5000);
			
		}};
		t1.start();
		
		

	}

}
