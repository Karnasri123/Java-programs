package inheritancemm;

public class testpractice {

	public static void main(String[] args) {
		 System.out.println("child ppt--------"); 
			test1 a=new test1();
			a.carloan();
			a.houseloan();
			a.gold();
			a.veh();
			a.land();//from parent
			a.cash();//from grand parent
			System.out.println();
			System.out.println("parent ppt---------");
			test b=new test();
			b.land();
			b.gold();
			b.cash();
			System.out.println();
			System.out.println("parent ppt as for child------");
			test c=new test1();
			c.land();
			c.gold();
			c.cash();
			System.out.println();
			System.out.println("gndpnt proper------------");
			test2 u=new test2();
			u.land();
			u.cash();
			System.out.println();
			System.out.println("gndpnt ppt as for parent and child------------");
			test2 d=new test1();
			d.land();
			d.cash();
			System.out.println();
			System.out.println("gndpnt ppt as for parent object--------------");
			test2 e=new test();
			e.land();
			e.cash();
			
	}

}
