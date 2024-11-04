package waitandnotify;

public class test {
	
	public void withdraw()
	{
		System.out.println("thread name----------"+Thread.currentThread().getName());
		try
		{
		Thread.sleep(2000);
		
		synchronized (this){
			System.out.println("thread is in waiting state"+Thread.currentThread().getName());
			wait();
			System.out.println("thread is in out of state"+Thread.currentThread().getName());
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	public void deposit()
	{
		System.out.println("thread name----------"+Thread.currentThread().getName());
		try
		{
		Thread.sleep(2000);
		synchronized (this){
			System.out.println("giving notification to waiting thread "+Thread.currentThread().getName());
			notifyAll();
			System.out.println("notification sent to all waiting threads withdraw"+Thread.currentThread().getName());
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		test a= new test();
		Thread t=new Thread()
				{
			public void run()
			{
				a.withdraw();
			}
				};
				t.setName("withdraw 1");
				
				t.start();
				Thread t2=new Thread()
				{
			public void run()
			{
				a.withdraw();
			}
				};
				t2.setName("withdraw 2");
				
				t2.start();
			Thread t1=new Thread(){
			public void run()
			{
				a.deposit();
			}
				};
				t1.setName("deposit");
				t1.start();
		
		

	}

}
