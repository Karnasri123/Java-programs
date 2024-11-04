package rectangle;

public class freepractice {

	public static void main(String[] args) {
		int n=20;
		System.out.println("given decimal number=="+n);
		String bin="";
		while(n>0) {
			int r=n%2;
			bin=r+bin;
			System.out.println(bin);

		n=n/2;
		}
		//System.out.println("binary number for decimal is--"+bin);
		/*String reverse="";
		for(int i=bin.length()-1;i>=0;i--)
		{
			reverse=reverse+bin.charAt(i);
		}
		System.out.println(reverse);*/
		
	}
	

}
