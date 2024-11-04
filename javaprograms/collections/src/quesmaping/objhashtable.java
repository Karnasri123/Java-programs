
package quesmaping;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class objhashtable {
	public static void main(String[]args) {
		Hashtable <emp1,Integer>m=new Hashtable();
		
		m.put(new emp1(1,"sri",88.5),100);
		m.put(new emp1(1,"sri",88.5),101);
		m.put(new emp1(3,"raji",68.5),102);
		m.put(new emp1(4,"srija",88.5),101);
		//System.out.println(m);
		for(Entry<emp1,Integer>h:m.entrySet())
		{
			System.out.println(h);
		}
		

}
}
