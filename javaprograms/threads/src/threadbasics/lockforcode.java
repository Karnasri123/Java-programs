package threadbasics;

public class lockforcode {
	public void m1()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1200);
			System.out.println("i value---"+i+"---thread name---"+Thread.currentThread().getName());
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		synchronized(this)
		{
		for(int j=1;j<=5;j++)
		{
			System.out.println("j value---"+j+"---thread name---"+Thread.currentThread().getName());
		}}
		
	}

	public static void main(String[] args) {
		lockforcode a=new lockforcode();
		Thread t=new Thread() {public void run()
			{
			a.m1();
			}
		};
		t.start();
		
		Thread t1=new Thread() {public void run()
		{
		a.m1();
		}
	};
	t1.start();

    

	}

}
