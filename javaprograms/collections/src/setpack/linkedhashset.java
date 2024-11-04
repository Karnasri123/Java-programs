package setpack;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
	
	//linked hash set can not allow duplicate value
	//it allows any kind of values
    // it allows precision order.
	public static void main(String[] args) {
		dept d= new dept(1,"mca",20.9);
		dept d1= new dept(2,"mba",20.9);
		dept d2= new dept(4,"mca",21.9);
		dept d3= new dept(4,"mca",21.9);
		LinkedHashSet h=new LinkedHashSet();
		
		h.add(d);
		h.add(d1);
		h.add(d2);
		h.add(d3);
		/*h.add(2);
		h.add("sri");
		h.add(2);
		h.add(true);
		h.add(null);*/
		System.out.println(h);
		System.out.println("-------------------------------------");
		Iterator data=h.iterator();
		while(data.hasNext()) {
			System.out.println(data.next());
		}
		

	}

}
