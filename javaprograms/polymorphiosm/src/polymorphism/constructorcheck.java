package polymorphism;

public class constructorcheck {

	public static void main(String[] args) {
		constructor a=new constructor(2,"raji",30000);
		/*a.setEid(1);
		a.setEname("sri");
		a.setEsal(20000);*/
		System.out.println(a.getEid());
		System.out.println(a.getEname());
		System.out.println(a.getEsal());
		constructor b=new constructor();
		b.setEid(1);
		b.setEname("sri");
		b.setEsal(20000);
		System.out.println(b.getEid());
		System.out.println(b.getEname());
		System.out.println(b.getEsal());
		
		
		
		


	}

}
