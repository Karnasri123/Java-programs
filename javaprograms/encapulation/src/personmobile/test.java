package personmobile;

public class test {

	public static void main(String[] args) {
		person a=new person();
		a.setPid(1);
		a.setPname("ram");
		a.setPage(25);
		aadhar b=new aadhar();
		b.setAid(2);
		b.setAnum("35783hfdtehw");
		b.setAadd("hyd");
		a.setAdh(b);
		
		mobile m1=new mobile();
		m1.setMid(3);
		m1.setMnum(88989899898L);
		m1.setMsim("airtel");
		mobile m2=new mobile();
		m2.setMid(4);
		m2.setMnum(9999999999L);
		m2.setMsim("jio");
		mobile[] mob= {m1,m2};
		a.setMob(mob);
		System.out.println(a.getPid()+" "+a.getPname()+" "+a.getPage());
		System.out.println(a.getAdh());
		System.out.println(a.getAdh().getAid()+" "+a.getAdh().getAnum()+" "+a.getAdh().getAadd());
		System.out.println("mobile array address=="+a.getMob());
		 mobile[] mdata= a.getMob();
		for(int i=0;i<=mdata.length-1;i++)
		{
			System.out.println("mobile id=="+mdata[i].getMid()+"/ "+"mobile num=="+mdata[i].getMnum()+" /"+"mobile sim=="+mdata[i].getMsim());
		}

}
}
