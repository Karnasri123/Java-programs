
public class staticm1 {
	public static  void m1 ()
	{
		System.out.println("hello");
		//m2();instance method can not be call in static method because instances are available  at running state
	}
	public void m2()
	{
		System.out.println("hii");
		m1();
	
	}
	public void m3()
	{
		System.out.println("h r u");//instance can communicate with static and instance variables
		m1();
		m4();
	}
	public void m4()
	{
		System.out.println(" wht");
		m1();
		m2();
	}

	public static void main(String[] args) {
		m1();
		//m2(); instances methods can not called without object creation
		
		staticm1 a= new staticm1();
		a.m2();
		a.m4();

	}

}
