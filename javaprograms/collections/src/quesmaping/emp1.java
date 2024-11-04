package quesmaping;

import java.util.Objects;

public class emp1 implements Comparable<emp1> {
	
		private Integer eid;
		private String ename;
		private Double esal;
		
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
			emp1 other = (emp1) obj;
			return eid == other.eid && Objects.equals(ename, other.ename)
					&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
		}
		
		public emp1(int eid, String ename, double esal) {
			
			this.eid = eid;
			this.ename = ename;
			this.esal = esal;
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
		@Override
		public int compareTo(emp1 o) {
			
			return this.eid.compareTo(o.getEid());
		}
		

}
