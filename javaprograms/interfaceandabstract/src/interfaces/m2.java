package interfaces;

public class m2 implements cebil {
	public void m1()
	{
		System.out.println(" hello world");
	}
	public void interest(int a)
	{
		System.out.println("value----"+a);
	}

	public static void main(String[] args) {
		m2 s= new m2();
		s.m1();
		s.interest(7);
		// multiple inheritance is not allowed in java but it allows in interface concept.

	}

}
