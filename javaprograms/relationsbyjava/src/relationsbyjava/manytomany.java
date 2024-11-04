package relationsbyjava;

import java.util.ArrayList;
import java.util.List;

public class manytomany {

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
		List<course> cc=new ArrayList();
		cc.add(new course(4,"java",35000));
		cc.add(new course(5,"python",45000));
		cc.add(new course(6,"devops",25000));
		p.setCo(cc);
		System.out.println("------------------person details----------------------");
		System.out.println(" id---"+p.getPid());
		System.out.println(" name--"+p.getPname());
		System.out.println(" age--"+p.getPage());
		System.out.println(" location--"+p.getPloc());
		System.out.println("---------------person passport details----------------------");
		System.out.println(" passport id--"+p.getPo().getPassid());
		System.out.println(" passport num--"+p.getPo().getPassnum());
		System.out.println(" passport expairy date--"+p.getPo().getPassexdate());
		System.out.println("-------------------mobile details----------------------");
		List<mobile> b=p.getMo();
		
		for(mobile m:b)
		{
			System.out.println("mobile id---"+m.getMid());
			System.out.println("mobile number---"+m.getMnum());
			System.out.println("mobile sim--"+m.getMsim());
			System.out.println("------------------------------------");
		}
		System.out.println("----------------course details----------------------");
		List<course> c=p.getCo();
		for(course m:c)
		{
			System.out.println("course id---"+m.getCid());
			System.out.println("course name---"+m.getCname());
			System.out.println("course fee--"+m.getCfee());
			System.out.println("------------------------------------");
		}
		
		

	}

}
