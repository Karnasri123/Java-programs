package springsbasic;

public class teamlead {
	private developer dev;
	
	public void setDev(developer dev) {
		this.dev = dev;
	}

	public void dowork(){
		System.out.println("tlead work started");
		dev.dowork();
		System.out.println("tlead work completed");
		
		
	}

}


