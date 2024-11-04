package polymorphism;

public class overarray {
	public void submit(String user,String pawd)
	{
		String[] n= {"sree","srija","ranga","naari"};
		String[] p=	{"akula@143","srija@123","ranga@143","naari@123"};
		int i=0;
		while(user.equals(n[i])&&pawd.equals(p[i]))
		{
			System.out.println("login to home page");
			i++;
		}
	
}

	public static void main(String[] args) {
	overarray a=new overarray();
	a.submit("srija","srija@123");
		


	}

}
