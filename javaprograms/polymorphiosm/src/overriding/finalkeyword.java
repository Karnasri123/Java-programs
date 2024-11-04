package overriding;

public /*final */class finalkeyword {
	int h=12;
	int i=20;
	public final int x=100;
	public void m1()
	{
		System.out.println(h+i+x);
	}
	public final void m2()
	{
		System.out.println(h-(i-x));
	}

	public static void main(String[] args) {
	 finalkeyword a=new finalkeyword();
	 a.h=10;
	 a.i=50;
	 //a.x=25; if a variable is declared with final variable then we cannot change the value already exist.
	 System.out.println(a.h);
	 System.out.println(a.i);
     System.out.println(a.x);
	}

}
