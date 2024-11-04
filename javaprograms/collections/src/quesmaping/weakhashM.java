package quesmaping;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
public class weakhashM {

	public static void main(String[] args) {
		emp1 d=new emp1(1,"mca",20.9);
		emp1 d1=new emp1(2,"mba",21.9);
		emp1 d2=new emp1(3,"ma",20.9);
		
		WeakHashMap <emp1,Integer> s=new WeakHashMap();
		
		s.put(d,101);
		s.put(d1,102);
		s.put(d2,103);
		d1=d2;
		System.out.println("------eligible for garbage collector------d1 ");
		System.gc();
		Iterator<Entry<emp1,Integer>>h=s.entrySet().iterator();
		while(h.hasNext())
		{
			Entry<emp1,Integer>t=h.next();
			System.out.println(t.getKey()+"------"+t.getValue());
		}

	}

}
