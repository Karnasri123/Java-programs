package inheritancemm;

public class child extends parent {
	private String gold="2 kgs";
	private String vehi= "car";

	public static void main(String[] args) {
		
    child a=new child();
    System.out.println("child properties=================");
    System.out.println(a.gold);
    System.out.println(a.vehi);
    System.out.println(a.cash);
    System.out.println(a.veh);
    System.out.println(a.land);
    System.out.println(a.house);;
    parent b=new parent();
    System.out.println();
    System.out.println("parent properties================");
    System.out.println(b.cash);
    System.out.println(b.veh);
    System.out.println(b.land);
    System.out.println(b.house);
    System.out.println();
    gndpnt c=new gndpnt();
    System.out.println("gndpa ppt====================");
    System.out.println(c.land);
    System.out.println(c.house);
    
    
    
    

	}

}
