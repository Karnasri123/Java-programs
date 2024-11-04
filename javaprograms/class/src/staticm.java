
public class staticm {
	int a=10;
	static int b=20;
	static
	{
		System.out.println("iam a static===="+b);//static can communicate directly with static but not instance
	}
	{
		System.out.println("iam an instance===="+b+a);//instance can communicate both static and instance
	}

	public static void main(String[] args) {          
		System.out.println("main------");      //reason: static variables and methods are loading at the time of compilation
		staticm a=new staticm();               //but instance variables and methods are used and call after object creation   
		                                       //object creation is done at second stage at runtime.

	}

}
