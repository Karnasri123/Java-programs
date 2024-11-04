package relationsbyjava;

public class mobile {
	
	private int mid;
	private long mnum;
	private String msim;
	
	public mobile(int mid, long mnum, String msim) {
		super();
		this.mid = mid;
		this.mnum = mnum;
		this.msim = msim;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	
	

}
