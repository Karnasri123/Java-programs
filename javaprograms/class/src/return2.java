
public class return2 {
	String m2(long ph)
	{  
		String[] n= {"nomatch","raja","raji","srija","sri","ranga"};
		long[] p= {0,888829988L,9893983938L,777777777L,888888222L,6767676767L};
		int index=0;
		for(int i=0;i<=p.length-1;i=i++)
		{
			if(ph==(p[i]));
					{
				System.out.println("index value========"+i);
				index=i;
					}
					
		}
		
		return n[index];
	}

	public static void main(String[] args) {
		
		return2 q=new return2();
		String valu = q.m2(0);
		System.out.println(valu);
		
	}

}
