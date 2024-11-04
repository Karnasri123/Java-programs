package listinterface;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		//stack class will implement list interface.
		// stack allows any kind of data.
		//stack allows duplicate data.
		// stack allows null values more than once.
		//in stack order of data is preserved.
		//stack follows LIFO(last in first out) concept in element deletion process.
		Stack s=new Stack();
		s.push(2);
		s.push(3);
		s.add("sri");
		s.add(7);
		s.add(2);
		s.add(null);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		

	}

}
