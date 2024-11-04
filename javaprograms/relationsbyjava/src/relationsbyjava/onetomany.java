package relationsbyjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class onetomany {

	public static void main(String[] args) {
		person p=new person();
		p.setPid(1);
		p.setPname("sri");
		p.setPage(24);
		p.setPloc("kadapa");
		passport t=new passport();
		t.setPassid(3);
		t.setPassnum("45636788vghv");
		t.setPassexdate(2029);
		p.setPo(t);
		List<mobile> mm=new ArrayList();
		mm.add(new mobile(1,4567789L,"jio"));
		mm.add(new mobile(2,6676878L,"airtel"));
		mm.add(new mobile(3,456787643L,"bsnl"));
		p.setMo(mm);
		
		System.out.println("person id---"+p.getPid());
		System.out.println("person name--"+p.getPname());
		System.out.println("person age--"+p.getPage());
		System.out.println("person loc--"+p.getPloc());
		System.out.println("person pass id--"+p.getPo().getPassid());
		System.out.println("person pass num--"+p.getPo().getPassnum());
		System.out.println("person pass expairy date--"+p.getPo().getPassexdate());
		List<mobile> b=p.getMo();
		
		for(mobile m:b)
		{
			System.out.println("mobile id---"+m.getMid());
			System.out.println("mobile number---"+m.getMnum());
			System.out.println("mobile sim--"+m.getMsim());
			System.out.println("------------------------------------");
		}
		

	}

}
