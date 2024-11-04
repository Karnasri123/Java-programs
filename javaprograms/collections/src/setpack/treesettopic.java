package setpack;

import java.util.TreeSet;

public class treesettopic {
        
	//tree set does not allow duplicate and null values
	//tree set allows same kind of data.
	//it gives output in ascending order.
	//it works on binary tree algorithms.
	
	//treeset add method will call compare method to compare the data inserted.
	// 0 is when have same data.
	//1 is representing left side and -1 represents right side of heap tree
	// compare can be done in same kind of data
	// if we insert object as a data object must have compare method to compare data otherwise it goes error.
	public static void main(String[] args) {
		
		Integer m=new Integer(34);
		Integer m1=new Integer(35);
		System.out.println(m.compareTo(m1));
		String n=new String("sri");
		String n1=new String("ram");
		
		System.out.println(n.compareTo(n1));
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(2);
		t.add(4);
		t.add(5);
		//System.out.println(t);

	}

}
