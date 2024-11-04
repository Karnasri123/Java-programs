package setpack;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		
		//hash set implements set.
		//hash set allows any kind of data but not allow duplicate data
		//hash set does not have order of precision
		//hash set allows null data only once.
		dept d= new dept(1,"mca",20.9);
		dept d1= new dept(2,"mba",20.9);
		dept d2= new dept(4,"mca",21.9);
		
	HashSet a=new HashSet();
		a.add(d);
		a.add(d1);
		a.add(d2);
		//a.add("ramu");
		//a.add(null);
		//a.add(null);
		//System.out.println(a.contains("ramu"));
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println("------------------------------------");
		//System.out.println(a);
		Iterator r=a.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
	}


}
