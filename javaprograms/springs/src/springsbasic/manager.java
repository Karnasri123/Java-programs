package springsbasic;

public class manager {
	private teamlead t1;
	
	public void setT1(teamlead t1) {
		this.t1 = t1;
	}

	public void dowork(){
		System.out.println("Manager work started");
		t1.dowork();
		System.out.println("manager work completed");
		
		
	}

}
