package product;

public class productpojo {
	private int pid;
	private String pname;
	private Double pcost;
	private String pvendor;
	private String pcountry;
	private String ptype;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPcost() {
		return pcost;
	}
	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}
	public String getPvendor() {
		return pvendor;
	}
	public void setPvendor(String pvendor) {
		this.pvendor = pvendor;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	@Override
	public String toString() {
		return "productpojo [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", pvendor=" + pvendor
				+ ", pcountry=" + pcountry + ", ptype=" + ptype + "]";
	}
	

}
