package exceptionhandling;

public class multicatch {

	public static void main(String[] args) {
		String[] arr= {"ram","shiva","krishna",""};
		String[] b= {};
      System.out.println("start");
      try {
    	  System.out.println(b);
      System.out.println(10/0);
      System.out.println(arr[1]);
     
      }catch(ArithmeticException e)
      {
    	  System.out.println("catch1--"+e);
      }catch(NullPointerException e)
      {
    	  System.out.println("catch2--"+e);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
    	  System.out.println("catch3--"+e);
      }/*catch(Exception e)// parent exception can not be write before child class because it becomes compilation error
      {
    	  System.out.println("catch3--"+e);
      }*/
      System.out.println("ended");
	}

}
