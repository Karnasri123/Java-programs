package quesmaping;

import java.util.Comparator;

public class std implements Comparator<emp1> {
	

	@Override
	public int compare(emp1 e1, emp1 e2) {
		
		Integer x=e1.getEid();
		Integer y=e1.getEid();
		return x.compareTo(y);
	}

	public static void main(String[] args) {
		
	}

}
