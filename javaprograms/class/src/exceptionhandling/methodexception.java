package exceptionhandling;

public class methodexception {
	public void m1() {
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
	}
	public void m2() {
		System.out.println("m2 started");
		m3();
		System.out.println("m2 ended");
	}
	public void m3() {
		System.out.println("m3 started");
		try {
			System.out.println("it will print");
		System.out.println(10/0);//if exception cannot handled then rest of the code after the exception will not execute 
		System.out.println("it will not print");//statement cannot execute even exception handling because it is in same block
		}catch(ArithmeticException e)
		{
			System.out.println("method handling--"+e);
		}
		System.out.println("m3 ended");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		
		methodexception b=new methodexception();
		b.m1();
		System.out.println("main ended");

	}

}
