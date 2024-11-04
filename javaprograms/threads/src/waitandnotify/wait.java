package waitandnotify;

public class wait {
public static double balance=7000;
	
	public synchronized void withdraw(int wtd) 
	{
		try {
			Thread.sleep(3000);
			if(wtd<=balance)
			{
				System.out.println("---------iam in withdrawl---------"+wtd);
				balance=balance-wtd;
				System.out.println("balance after withdraw-----"+balance);
			}
			else
			{
				System.out.println("-----insufficient funds try after sometime");
				System.out.println("waiting to the notification");
				wait();
				System.out.println("rceived the notification to go");
				System.out.println("---------iam in withdrawl---------"+wtd);
				balance=balance-wtd;
				System.out.println("balance after withdraw-----"+balance);
				
			}	
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	public synchronized void deposit(int dpt)
	{
		try {
			Thread.sleep(3000);
			System.out.println("--------iam in deposit----"+dpt);
			balance=balance+dpt;
			System.out.println("balance after deposit-----"+balance);
			notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		wait a=new wait();
		System.out.println("available balance---------------------"+a.balance);
		Thread t=new Thread() {
			public void run()
			{
				a.withdraw(9000);
			
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
