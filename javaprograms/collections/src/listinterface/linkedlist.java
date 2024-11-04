package listinterface;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		//linked list class will implement list interface.
				// linked list allows any kind of data.
				//linked list allows duplicate data.
				// linked list allows null values more than once.
				//in linked list order of data is preserved.
				//linked list is not good for fetching of data.
				//linked list is good for adding of data.
				//not good for fetching data because address of one node is present in previous node
				LinkedList h= new LinkedList();
				h.add(12);          
				h.add("sri");
				h.add(98.5);
				h.add(true);
				h.add(24);
				h.add(12);
				h.add(null);
				h.add(null);
				System.out.println(h);
				System.out.println(h.contains("sri"));
				System.out.println(h.isEmpty());
				System.out.println(h.indexOf(24));
				System.out.println(h.size());
				System.out.println(h.get(6));
				System.out.println(h.get(2));
				System.out.println(h.remove(null));
				System.out.println(h);
			

	}

}
