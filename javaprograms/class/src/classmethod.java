
public class classmethod {
	double a;
	double b;
	void add() {
		System.out.println("add method");
		a=10;
		b=25;
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println("sub method");
a=5;
b=10;
		System.out.println((a-b));
	}
	

	public static void main(String[] args) {
		classmethod m=new classmethod();
		System.out.println(m.a);
		System.out.println(m.b);
		m.sub();
		m.add();
		classmethod n=new classmethod();
		System.out.println(n.a);
		System.out.println(n.b);
		n.sub();
		n.add();
		

	}

}
