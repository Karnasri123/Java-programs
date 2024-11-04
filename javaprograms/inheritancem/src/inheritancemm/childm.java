package inheritancemm;

public class childm extends parentm {
	public void p2()
	{
		String veh="car";
		String land="8 acres";
		System.out.println(veh);
		System.out.println(land);
	}
	

	public static void main(String[] args) {
		childm d=new childm();
		System.out.println("child ppt==============");
		d.p2();
		d.p1();
		//d.p();
		System.out.println();
		System.out.println("parent ppt==========");
		parentm a=new parentm();
		a.p1();
		//a.p();
		System.out.println();
		//System.out.println("gnfpa ppt===========");
		//gndpntm b=new gndpntm();
		//a.p();
		System.out.println();
		parentm c=new childm();
		c.p1();

	} 

}
