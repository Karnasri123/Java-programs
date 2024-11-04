package polymorphism;

public class overloading {
	public final void submit(String user,String pawd)
	{
		if(user.equals("sree")&&pawd.equals("akula@143")) {
			System.out.println("wlcome to homapage");
		}
		else
		{
			System.out.println("invalid user name ans pawd");
		}
	}
	public void submit(String user,int otp)//same method we can use many times with passing different parameter types
	{
		if(user.equals("sree")&&otp==1234) {
			System.out.println("wlcome to homapage-----user and pawd");
		}
		else
		{
			System.out.println("invalid user name and otp");
		}
	}
	public String submit(String user,String fschool,String nickname)
	{
		if(user.equals("sree")&&fschool.equals("svem")&&nickname.equals("sri sri")) {
			System.out.println("wlcome to homapage-----squestion1 and squestion2");
		}
		else
		{
			System.out.println("invalid user and credentials");
		}
		return "user";
		
	}

	public static void main(String[] args) {
		overloading c=new overloading();
		c.submit("sree", 1234);
		c.submit("sree","akula@143");
		c.submit("sree","svem","sri sri");

	}

}
