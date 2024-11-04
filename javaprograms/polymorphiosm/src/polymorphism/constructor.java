package polymorphism;

public class constructor {
	private int eid;
	private String ename;
	private double esal;
	
	public constructor(int eid,String ename,double esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}//instead setter method we can use constructor method by passing parameters.
	public constructor() 
	{
		
	  System.out.println("default constructor");	
	}
	

	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsal() {
		return esal;
	}


	public void setEsal(double esal) {
		this.esal = esal;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
