
public class parameter {
	void add(int a,int b) {
		System.out.println("add method");
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println("sub method");
		System.out.println((a-b));
	}
	void mul(int a,int b)
	{
		System.out.println("mul method");
		System.out.println((a*b));
	}
	void div(int a,int b)
	{
		System.out.println("div method");
		System.out.println((a/b));
	}
	void mod(int a,int b)
	{
		System.out.println("mod method");
		System.out.println((a%b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter m=new parameter();
			
			m.sub(20,10);
			m.add(30,20);
			m.mul(10,20);
			m.div(20,10);
			m.mod(10,3);

	}

}
