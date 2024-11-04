
public class methodreturn {
	String[] m1()
	{
		String[] name= {"raji","srija","sri","ranga"};
		for(int i=0;i<=name.length-1;i++)
		{
		System.out.println("name==="+name[i]);
		}
		return name;
	}

	public static void main(String[] args) {
		methodreturn s=new methodreturn();
		String[] val=s.m1();
		System.out.println(val);
		
	}

}
