package encapulation1;

public class test {
	public static void main(String[]args) {
		//aadhar b=new aadhar(2,3564736,"kadapa");
		
		person a=new person(1,"raji",24,(new aadhar(2,2352,"kadapa")));
		System.out.println(a.getPid());
		System.out.println(a.getPname());
		System.out.println(a.getPage());
		System.out.println(a.getAdh().getAid()+" "+a.getAdh().getAnum()+" "+a.getAdh().getAadd());
		
		/*a.setPid(1);
		a.setPname("sree");
		a.setPage(25);
		aadhar b=new aadhar();
		b.setAid(2);
		b.setAnum(34567);
		b.setAadd("kadapa");
		
		a.setAdh(b);
		System.out.println(a.getPid());
		System.out.println(a.getPname());
		System.out.println(a.getPage());
		System.out.println(a.getAdh());
		System.out.println(a.getAdh().getAid()+" "+a.getAdh().getAnum()+" "+a.getAdh().getAadd());
	
		aadhar b=new aadhar();
		b.setAid(1);
		b.setAnum(56788);
		b.setAadd("kadapa");
		System.out.println(b.getAid());
		System.out.println(b.getAnum());
		System.out.println(b.getAadd());*/
	
	
	}

}
