
public class methodc1 {
	void m1(methodc b)
	{
	System.out.println(b);
	System.out.println(b.sid);
	System.out.println(b.sname);
	System.out.println(b.smarks);
	System.out.println(b.sresults);
	}

	public static void main(String[] args) {
		methodc1 p=new methodc1();
		methodc s=new methodc();
		//s.sid=1;
		//s.sname="srija";
		//s.smarks=45;
		//s.sresults=true;
		build t=new build();
		p.m1(s);
		
		
	}

}
