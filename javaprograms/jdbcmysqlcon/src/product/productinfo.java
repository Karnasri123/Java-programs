package product;

public class productinfo {

	public static void main(String[] args) {
		productpojo pd=new productpojo();
		pd.setPid(2);
		pd.setPname("choclate");
		pd.setPcost(7.9);
		pd.setPvendor("aasha");
		pd.setPcountry("india");
		pd.setPtype("snacks");
		productcontrol pc=new productcontrol();
		//pc.save(pd);
		//pc.update(8900.7, "ram", 1);
       // pc.delete(1);
		//pc.getbyid(2);
		pc.getall();
	}

}
