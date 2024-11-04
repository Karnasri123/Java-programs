package relationsbyjava;

public class course {
	private int cid;
	private String cname;
	private int cfee;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCfee() {
		return cfee;
	}
	public void setCfee(int cfee) {
		this.cfee = cfee;
	}
	public course(int cid, String cname, int cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	

}

