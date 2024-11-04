package listinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		//array list class will implement list interface.
		// array list allows any kind of data.
		//array list allows duplicate data.
		// array list allows null values more than once.
		//in array list order of data is preserved.
		//array list is good for fetching of data.
		//array list is not good for adding of data.
		//because if we add(or)remove any element in middle of array then no. of index operations should be done.
		ArrayList h= new ArrayList();
		h.add(12);          
		h.add("sri");
		h.add(98.5);
		h.add(true);
		h.add(24);
		h.add(12);
		h.add(null);
		h.add(null);
		/*System.out.println(h);
		System.out.println(h.contains("sri"));
		System.out.println(h.isEmpty());
		System.out.println(h.indexOf(24));
		System.out.println(h.size());
		System.out.println(h.get(6));
		System.out.println(h.get(2));
		System.out.println(h.remove(null));*/
		System.out.println(h);
		System.out.println("--------------------------------------");
		Iterator data=h.iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
	}

}
