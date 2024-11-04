package threadbasics;

public class methodthread implements Runnable {
	public void m1()
	{
		System.out.println("m1 method-----"+Thread.currentThread().getName());
	}
	public void m2()
	{
		System.out.println("m2 method-----"+Thread.currentThread().getName());
	}
	public void run()
	{
		System.out.println("run method----"+Thread.currentThread().getName());
		m1();
		m2();
		
	}

	public static void main(String[] args) {
		
		methodthread a= new methodthread();
		Thread t= new Thread(a);
		t.start();
		Thread t1= new Thread(a);
		t1.start();
	
	}

}
