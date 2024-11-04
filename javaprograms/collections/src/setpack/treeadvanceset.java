package setpack;

import java.util.Iterator;
import java.util.TreeSet;

public class treeadvanceset {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<>();
		t.add(new dept(6,"mca",18.9));
		t.add(new dept(2,"cma",181.9));
		t.add(new dept(3,"sa",118.9));
		System.out.println(t);
		System.out.println("----------------------------------------------------------");
		Iterator data=t.iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		
		

	}

}
