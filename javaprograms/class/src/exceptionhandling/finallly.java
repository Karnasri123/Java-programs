package exceptionhandling;

public class finallly {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		}catch(Exception e)
		{
			System.out.println(e);
		}finally {
			System.out.println("final block will be executed");
		}
		System.out.println("ended");

	}

}
