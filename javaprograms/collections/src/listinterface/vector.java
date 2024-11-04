
package listinterface;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		//vector class will implement list interface.
		// vector allows any kind of data.
		//vector allows duplicate data.
		// vector allows null values more than once.
		//in vector order of data is preserved.
		//it is thread safety.
		//it will normal capacity 10.
		Vector v=new Vector();
		v.add(2);
		v.add("sri");
		v.add(3);
		v.add(5);
		v.add(2);
		v.add(null);
		v.add(7);
		System.out.println(v);
		//System.out.println(v.firstElement());
		System.out.println(v.capacity());
		//System.out.println(v.elementAt(3));
	}

}
