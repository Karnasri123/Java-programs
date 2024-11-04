package flowcontro;

public class ifelse4 {

	public static void main(String[] args) {
		String uname="sriraji";
		String pswd="123@sri";
		String petname="jockey";
		String firstfnd="sai";
		int otp=1234;
		if(uname=="sraji"&&pswd=="123@sri")
		{
			System.out.println("login successfully");
					
		}
		else
		{
			System.out.println("log in  credintials failed");
			if(petname=="jckey"&&firstfnd=="sai")
			{
				System.out.println("successfully answered  and enter otp to get pasd");
				if(otp==1234)
				{
			System.out.println("your password=="+pswd);
			}
				else
				{
					System.out.println("incorrect otp");
				}
			}
			else
			{
				System.out.println("try again credintials qs");
				if(petname=="jockey"&&firstfnd=="sai")
				{
					System.out.println("successfully answered credintials");
					System.out.println("your password=="+pswd);
					
				}
				
			}
		}
	}

}
