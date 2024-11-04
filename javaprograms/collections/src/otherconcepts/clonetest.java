package otherconcepts;

public class clonetest {

	public static void main(String[] args) {
		employeeclone p=new employeeclone();
		p.setEid(1);
		p.setEname("raji");
		p.setEsal(89.3);
		p.setEdesg("hyd");
		System.out.println(p.getEid()+"---"+p.getEname()+"---"+p.getEsal()+"---"+p.getEdesg());
		System.out.println("-----------------------------------------------");
		employeeclone p2=p.clone();
		System.out.println("before changes");
		System.out.println(p.getEid()+"---"+p.getEname()+"---"+p.getEsal()+"---"+p.getEdesg());
		System.out.println(p2.getEid()+"---"+p2.getEname()+"---"+p2.getEsal()+"---"+p2.getEdesg());
        System.out.println("--------------------------------------------------------------");
        System.out.println("after changes");
		p2.setEdesg("bang");
		System.out.println(p.getEid()+"---"+p.getEname()+"---"+p.getEsal()+"---"+p.getEdesg()); 
		System.out.println(p2.getEid()+"---"+p2.getEname()+"---"+p2.getEsal()+"---"+p2.getEdesg());

	}

}
