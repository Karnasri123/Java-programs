package flowcontro;

public class ifelse3 {

	public static void main(String[] args) {
		int pin=1357;
		int bal=7000;
		int wd=8000;
		if(pin==1257)
		{
			System.out.println("welcome to sbi Atm");
			if(wd<bal)
			{
				System.out.println("successfully withdrawl=="+(bal-wd));
			}
			else
			{
				System.out.println("insufficient amount");
			}
		}
		else
		{
			System.out.println("incorrect pin");
		}
	}

}
