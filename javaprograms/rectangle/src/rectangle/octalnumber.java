package rectangle;

public class octalnumber {

	public static void main(String[] args) {
		int n=10;
		String oct="";
		
		while(n>0) {
			int r=n%8;
			oct=r+oct;
			n=n/8;
		}
		System.out.println(oct);

	}

}
