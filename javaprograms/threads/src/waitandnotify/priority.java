package waitandnotify;


public class priority {
	
	// higher priority thread will get more number of chances than others
	//least priority will be 1 and high will be 10.
	//yield method can give chance to other thread which have higher priority
	//if two threads have same priority than thread scheduler will choose which thread has to go
	//default priority value of a thread is 5. 
	public void m1()
	{
		System.out.println("m1 method calling"+" "+Thread.currentThread().getName());
		for (int i=1;i<=10;i++)
		{
		System.out.println("thread name-------"+Thread.currentThread().getName()+" "+i);
		}
		//System.out.println("default thread-------"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		priority p=new priority();
		Thread t=new Thread()
				{
			public void run()
			{
				p.m1();
			}
				};
		t.setName("one thread");
		//t.yield();
		t.start();
        t.yield();
		Thread t1=new Thread()
		{
	public void run()
	{
		p.m1();
	}
		};
t1.setName("two thread");
t1.setPriority(8);
t1.start();
	}

}
