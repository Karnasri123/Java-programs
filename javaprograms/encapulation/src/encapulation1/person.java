package encapulation1;

public class person {
	private int pid;
	private String pname;
	private int page;
	private aadhar adh;
	
	

	public person(int pid, String pname, int page, aadhar adh) {
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.adh = adh;
	}


	public aadhar getAdh() {
		return adh;
	}


	public void setAdh(aadhar adh) {
		this.adh = adh;
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


	public static void main(String[] args) {
		
	}

}