package setpack;

import java.util.Objects;

public class dept implements Comparable<dept>{
	private Integer did;
	private String dname;
	private Double dincome;
	
	
	public dept(Integer did, String dname, Double dincome) {
		super();
		this.did = did;
		this.dname = dname;
		this.dincome = dincome;
	}


	@Override
	public String toString() {
		return "did=" + did + ", dname=" + dname + ", dincome=" + dincome;
	}


	@Override
	public int hashCode() {
		return Objects.hash(did, dincome, dname);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dept other = (dept) obj;
		return Objects.equals(did, other.did) && Objects.equals(dincome, other.dincome)
				&& Objects.equals(dname, other.dname);
	}


	public Integer getDid() {
		return did;
	}


	public void setDid(Integer did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Double getDincome() {
		return dincome;
	}


	public void setDincome(Double dincome) {
		this.dincome = dincome;
	}


	@Override
	public int compareTo(dept o) {
		// TODO Auto-generated method stub
		return this.dincome.compareTo(o.getDincome());
	}
	
	
	
	
	
	

}
