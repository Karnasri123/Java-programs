
public class practice1 {
	int sid;
	String sname;
	double marks;
	void test(practice2 s)
	{
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.smarks);
		System.out.println(s.squal);
	}

	public static void main(String[] args) {
		practice1 a=new practice1();
		a.sid=3;
		a.sname="sri";
		a.marks=71;
		practice2 b=new practice2();
		b.sid=1;
		b.sname="ranga";
		b.smarks=98.5;
		b.squal=true;
		practice2 c=new practice2();
		c.sid=2;
		c.sname="neelima";
		c.smarks=85;
		c.squal=true;
		
		a.test(b);
		a.test(c);

		
		
		
	}

}
