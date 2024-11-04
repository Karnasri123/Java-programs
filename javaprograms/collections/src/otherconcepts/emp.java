package otherconcepts;

import java.util.Objects;

public class emp {
	private int eid;
	private String ename;
	private double esal;
	
	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, esal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		emp other = (emp) obj;
		return eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
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
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}
	protected void finalize() throws Throwable
	{
		 
	}
	
	


}
