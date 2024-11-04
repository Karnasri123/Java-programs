package threadbasics;

public class synchronizelock extends Thread   {
	// sync keyword act as a lock it allows only one thread at a time
	//it allows another thread after completion task for same method
	// it is useful for one object of instance
	//it failure for multiple object creation
	//so use static keyword which will load  method in class at one time(no copy of multiple instances like object)
	public synchronized static void wdraw()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("value-----"+i+"----------"+Thread.currentThread().getName());
		}
	
	}
	/*public synchronized static void deposit()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("value-----"+i+"----------"+Thread.currentThread().getName());
		}
	}*/

	public static void main(String[] args) {

		//synchronizelock a=new synchronizelock();
		//synchronizelock a1=new synchronizelock();
		
		Thread t= new Thread()
				{
				public void run()
				{
					wdraw();
				}};
				t.start();
				Thread t1=new Thread()
						{
					public void run()
					{
						synchronizelock.wdraw();
					}};
					t1.start();
						}
	
	
	}

	


