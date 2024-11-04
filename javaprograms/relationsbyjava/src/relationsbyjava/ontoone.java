package relationsbyjava;

public class ontoone {

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
		System.out.println("person id---"+p.getPid());
		System.out.println("person name--"+p.getPname());
		System.out.println("person age--"+p.getPage());
		System.out.println("person loc--"+p.getPloc());
		System.out.println("person pass id--"+p.getPo().getPassid());
		System.out.println("person pass num--"+p.getPo().getPassnum());
		System.out.println("person pass expairy date--"+p.getPo().getPassexdate());
	}

}
