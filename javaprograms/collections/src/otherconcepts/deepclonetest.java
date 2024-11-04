package otherconcepts;

public class deepclonetest {

	public static void main(String[] args) {

		employeeclone p=new employeeclone();
		p.setEid(1);
		p.setEname("raji");
		p.setEsal(89.3);
		p.setEdesg("hyd");
		dept d=new dept();
		d.setDid(100);
		d.setDname("sri");
		d.setDloc("kadapa");
		p.setDep(d);
		System.out.println(p.getEid()+"---"+p.getEname()+"---"+p.getEsal()+"---"+p.getEdesg()+"---"+p.getDep().getDid()+"--"+p.getDep().getDname()+"--"+p.getDep().getDloc()); 
		System.out.println("---------------------------------");
		employeeclone p3=p.clone();
		System.out.println("before cahnging");
		System.out.println(p.getEid()+"---"+p.getEname()+"---"+p.getEsal()+"---"+p.getEdesg()+"---"+p.getDep().getDid()+"--"+p.getDep().getDname()+"--"+p.getDep().getDloc()); 
		System.out.println(p3.getEid()+"---"+p3.getEname()+"---"+p3.getEsal()+"---"+p3.getEdesg()+"---"+p3.getDep().getDid()+"--"+p3.getDep().getDname()+"--"+p3.getDep().getDloc());
		/*p3.setEdesg("bang");
		p3.getDep().setDloc("nellore");
		p.getDep().setDname("raji");	
		p.getDep().setDid(101);*/
		System.out.println("-------------------------------------------------------------");
		System.out.println("after changing");
		p3.getDep().setDname("mca");
		p3.getDep().setDid(101);
		System.out.println(p.getEid()+"---"+p.getEname()+"---"+p.getEsal()+"---"+p.getEdesg()+"---"+p.getDep().getDid()+"--"+p.getDep().getDname()+"--"+p.getDep().getDloc()); 
		
		System.out.println(p3.getEid()+"---"+p3.getEname()+"---"+p3.getEsal()+"---"+p3.getEdesg()+"---"+p3.getDep().getDid()+"--"+p3.getDep().getDname()+"--"+p3.getDep().getDloc());
        
	}

}
