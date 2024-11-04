package threadbasics;

public class secondwaythread implements Runnable {
	public  void run()
	{
		System.out.println("run method----"+Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
		{
			System.out.println("value----"+i+"----thread name----"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		secondwaythread s=new secondwaythread();
		Thread a=new Thread(s);
		a.start();
		//a.start();// throw new IllegalThreadStateException();
		// so create another thread instance with another reference
		secondwaythread s1=new secondwaythread();
		// no change in out put if we create another instance for our class
		// we can give argument s1 or s gives same output
		Thread b=new Thread(s1);
		b.start();
		
		
		

	}

}
