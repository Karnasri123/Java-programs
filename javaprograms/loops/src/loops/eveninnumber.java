package loops;

public class eveninnumber {

	public static void main(String[] args) {
		
	 int n=143567;
	 int last=0;
	 System.out.println("original number=="+n);
	 System.out.println("even digits in a number are");
	 while(n>0)
	 {
		 last=n%10;
		 if(last%2==0)
		 {
			 System.out.println(last);
		 }
		 
		 n=n/10;
		 
	 }
	 
	}

}
