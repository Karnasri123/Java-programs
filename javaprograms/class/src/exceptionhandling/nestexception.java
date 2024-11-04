package exceptionhandling;

public class nestexception {

	public static void main(String[] args) {
		String[] a= {"","ram","shiva"};
		try {
			System.out.println("start");
			System.out.println(10/2);
			try {
			System.out.println(a[4]);
			try
			{
				System.out.println(a[0]);
			}catch(NullPointerException e)
			{
				System.out.println("inner2--"+e);
			}
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("inner1--"+e);
			}
		}catch(ArithmeticException e)
		{
			System.out.println("outblock--"+e);
		}
		System.out.println("ended");

	}

}
