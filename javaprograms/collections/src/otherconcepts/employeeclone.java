package otherconcepts;

import java.util.concurrent.Callable;

public class employeeclone implements Cloneable {
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	private dept dep;
	
	public dept getDep() {
		return dep;
	}
	public void setDep(dept dep) {
		this.dep = dep;
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
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public employeeclone clone()
	{
		employeeclone emp=null;
		try
		{
		emp=(employeeclone) super.clone();
		dept k =emp.getDep();
		dept cloneddept=k.clone();
		emp.setDep(cloneddept);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return emp;
	}
	

}
