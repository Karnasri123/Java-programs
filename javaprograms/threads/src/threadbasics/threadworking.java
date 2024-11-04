package threadbasics;

public class threadworking extends Thread {
	public void run()
	{
		System.out.println("run thread-----"+Thread.currentThread().getName());
		for(int i=100;i>=1;i--)
		{
			System.out.println("value--"+i+"------thread name-----"+Thread.currentThread().getName());
		}
	}
	public void run(int i)
	{
		System.out.println("thread name----"+i+"---"+Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
		System.out.println("thread name-----"+Thread.currentThread().getName());
		System.out.println("------------------------------");
		threadworking t=new threadworking();
		t.start();
		for(int i=1;i<=100;i++)
		{
			System.out.println("value--"+i+"-----thread name----"+Thread.currentThread().getName());
		}
		t.run(2);
		//created threads are work together
		// we don't know which thread completes task first.

	}

}
