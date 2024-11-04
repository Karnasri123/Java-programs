
public class threadtesting {
	public void m1()
	{
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
	}
	public void m2()
	{
		System.out.println("m2 started");
		m3();
		System.out.println("m2 ended");
	}
	public void m3()
	{
		System.out.println("m3 started");
		System.out.println("m3 ended");
	}

	public static void main(String[] args) {// jvm creates one thread for main class which check sequence order
		System.out.println("main started");
		threadtesting t=new threadtesting();//object is created in heap memory
		t.m1();                             //methods are stored in stack by thread
		System.out.println("main ended");
		
	}

}
