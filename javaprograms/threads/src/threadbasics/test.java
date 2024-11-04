package threadbasics;

public class test extends Thread {
	@Override
	public void run()
	{
		System.out.println("thread name-------"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("thread name-----"+Thread.currentThread().getName());
		test n=new test();
		n.start();
		//run method must be override to get thread in to your class.
		// start method cannot be override because it will not create thread.
		//REASONS
		// if we override start method it will not enter to parent class so there is no possible of thread creation.
		//object creation must be child class because if we create parent object thread created in parent class.
		//it will never come to our class(test class).
		//call start method with super key word if we override the start method.
		//because super keyword always extract values from parent class .so it will call start method from parent class

	}

}
