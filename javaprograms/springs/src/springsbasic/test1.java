package springsbasic;

public class test1 {

	public static void main(String[] args) {
		manager m=new manager();
		
		teamlead t=new teamlead();
		m.setT1(t);
		developer d= new developer();
		t.setDev(d);
		m.dowork();
		
		

	}

}
