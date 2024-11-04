package overriding;

public class testfinal extends finalkeyword {/* if a parent class is declared with final keyword then child class cannot
extend properties of parent*/
	public void m1()
	{
		System.out.println(h+(i-x));
	}
	/*public void m2()//we cannot be override a method which has final keyword
	{
		System.out.println("cannot override"+(h+i+x));
	}*/

	public static void main(String[] args) {
		
		testfinal a=new testfinal();
		a.m1();
		a.m2();
	}

}
