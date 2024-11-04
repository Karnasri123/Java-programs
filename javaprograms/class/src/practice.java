
public class practice {
	long getnumber(String name)
	{
		String[] n= {"raji","ranga","sri","naari","srija","sai"};
		long[] p= {888888888L,9999999999L,777777777L,666666666L,5555555555L,010101010101L};
		int index=0;
		for(int i=0;i<=n.length-1;i++)
		{
			if(name.equals(n[i]))
			{
				System.out.println("name==="+n[i]);
				 index=i;
			}
			
		}
		return p[index];
	}



	public static void main(String[] args) {
		practice a=new practice();
		long h=a.getnumber("sai");
		System.out.println(h);
		

	}

}
