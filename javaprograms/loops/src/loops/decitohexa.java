package loops;

public class decitohexa {

	public static void main(String[] args) {
      int deci=27;
      String hexa="";
      while(deci>0)
      {
    	  int r=deci%16;
    	  if(r>=0&&r<10)
    	  {
    		  hexa=r+hexa;
    	  }
    	  else
    	  {
    		  hexa=(char)(r+55)+hexa;
    	  }
    	  deci=deci/16;
      }
      System.out.println(hexa);


	}

}
