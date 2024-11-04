
public class bill {
	void m1(double tbill,double dis)
	{
		System.out.println("bill amount==="+tbill);
		System.out.println("discount rate==="+dis);
		double disval=(tbill/100*dis);
		double fbill=tbill-disval;
		System.out.println("discount value=="+disval);
		System.out.println("customer final bill==="+fbill);
	}

	public static void main(String[] args) {
		int tbill=6000;
		bill c=new bill();
		if(tbill>0&&tbill<=10000)
		{
			c.m1(tbill,10);
			
			
		}
		else if(tbill>10000&&tbill<=20000)
		{

			c.m1(tbill,20);
		}
		else if(tbill>20000&&tbill<=30000)
		{

			c.m1(tbill,30);
		}
		else
		{

			c.m1(tbill,40);
		}
	}

}
