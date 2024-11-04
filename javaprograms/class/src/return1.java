
public class return1 {
	long m2(String name)
	{  
		String[] n= {"nomatch","raja","raji","srija","sri","ranga"};
		long[] p= {0,888829988L,9893983938L,777777777L,888888222L,6767676767L};
		int index=0;
		for(int i=0;i<=n.length-1;i=i+1)
		{
			if(name.equals(n[i]))
					{
				System.out.println("index value========"+i);
				index=i;
					}
					
		}
		
		return p[index];
	}

	public static void main(String[] args) {
		return1 t=new return1();
		long valu = t.m2("raji");
		System.out.println(valu);
		
	}

}
