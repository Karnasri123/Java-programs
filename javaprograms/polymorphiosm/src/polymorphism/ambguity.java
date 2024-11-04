package polymorphism;

public class ambguity {
	public void m1(int x,int y)// it will take perfect match method it executes both are integers
	{
		System.out.println("both are integer values");
	}
	public void m1(int x,double y)
	{
		System.out.println("one int and one double");
	}
	/*public void m1(double x,int y)//it will take another method with args double when there is no perfect match
	{
		System.out.println("one double and one int");
	}
	public void m1(double x,double y)
	{
		System.out.println("both are double values");
	}*/
	

	public static void main(String[] args) {
		ambguity a=new ambguity();
		a.m1(3, 4);
		//a.m1(5,5.9);
		//a.m1(9.3,10);
		//a.m1(5.3,2.5);

	}

}
