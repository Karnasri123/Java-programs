package loops;

public class stringpalindrome {

	public static void main(String[] args) {
		String reverse="";
		String name="revol ym si ijaR";
		//System.out.println(name.length());
		System.out.println("string name=="+name);
		//System.out.println("reverse=="+reverse);
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
			//System.out.println(reverse);
		}
		System.out.println(reverse);
		

	}

}
