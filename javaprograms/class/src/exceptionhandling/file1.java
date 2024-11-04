package exceptionhandling;

public class file1 {

	public static void main(String[] args) {
		System.out.println("start");
		try {
		System.out.println(10/0);//arithmetic exception handling using try catch
		System.out.println("it will not printed");//after exception occur next statement will not print in block
		}catch(ArithmeticException e)
		{
			System.out.println("arithmetic handling--"+e);
		}
		System.out.println("ended");
	}

}
