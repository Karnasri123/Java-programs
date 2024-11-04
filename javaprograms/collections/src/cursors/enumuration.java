package cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class enumuration {

	public static void main(String[] args) {
		Vector a= new Vector();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		//System.out.println(a);
		//a.elements();//enumeration will be worked only for vector and stack.
		//enumeration has two methods 1.hasMoreElements(gives true or false by checking element exist or not).
		//2.nextElement()goes to next element.
		Enumeration data=a.elements();
		while(data.hasMoreElements())
		{
			System.out.println(data.nextElement());
		}
		System.out.println("-------------------------------------");
		Stack b= new Stack();// stack can allows any kind of data
		b.add("sri");        // stack can allow duplicate data
		b.add(null);         // stack allows null values
		b.add(3);
		b.add("ram");
		b.add(5);
		b.add(5);
		Enumeration dat=b.elements();
		while(dat.hasMoreElements())
		{
			System.out.println(dat.nextElement());
		}
		
		

	}

}
