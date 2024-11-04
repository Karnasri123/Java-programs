package relationsbyjava;

import java.util.List;

public class person {
 
	private int pid;
	private String pname;
	private int page;
	private String ploc;
	private passport po;
	private List<mobile> mo;
	private List<course> co;
	
	
	
	public List<course> getCo() {
		return co;
	}
	public void setCo(List<course> co) {
		this.co = co;
	}
	public List<mobile> getMo() {
		return mo;
	}
	public void setMo(List<mobile> mo) {
		this.mo = mo;
	}
	public passport getPo() {
		return po;
	}
	public void setPo(passport po) {
		this.po = po;
	}
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	
}
