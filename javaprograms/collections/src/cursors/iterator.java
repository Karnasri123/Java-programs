package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {

	public static void main(String[] args) {
		//iterator can use for any class
		// import of class is necessary.
		ArrayList a= new ArrayList();
		a.add(1);
		a.add("sri");
		a.add(98.5);
		a.add(true);
		Iterator data=a.iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
		}
		ListIterator dat=a.listIterator();//it works for list implemented classes only.
		System.out.println("-----------------------------------------------------------------------------");
		while(dat.hasNext()) {
			System.out.println(dat.next());
		}

	}

}
