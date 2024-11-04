package exceptionhandling;

public class tryfinal {

	public static void main(String[] args) {
		System.out.println("start");
		try
		{
			System.out.println(10/2);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}finally {
			System.out.println("final block will be executed");
		}
		System.out.println("end");
		

	}

}
