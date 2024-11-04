package advance;

public class employee {
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	private String eloc;
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
	public String getEloc() {
		return eloc;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + ", eloc=" + eloc
				+ "]";
	}
	

}
