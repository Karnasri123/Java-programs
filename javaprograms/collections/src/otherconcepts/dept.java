package otherconcepts;

public class dept implements Cloneable {
	private int did;
	private String dloc;
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public dept clone()
	{
		dept depart=null;
		try
	{
		depart=(dept) super.clone();
	}catch(Exception e)
	{
		System.out.println(e);
	}
		
		return depart;
	}
	

}
