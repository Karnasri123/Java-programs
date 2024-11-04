package quesmaping;

import java.util.TreeMap;
import java.util.Map.Entry;

public class treemap {

	public static void main(String[] args) {
		TreeMap<emp1,Integer> t=new TreeMap();//use wrapper classes as datatype in emp class
		t.put(new emp1(2,"srija",88.5), 100);
		t.put(new emp1(3,"srikanth",89.5), 101);
		t.put(new emp1(4,"raji",87.5), 103);
		t.put(new emp1(4,"raji",87.5), 103);
		System.out.println(" "+t);
		System.out.println("-----------------------------------------------------");
		for(Entry<emp1,Integer>h:t.entrySet())
		{
			System.out.println(h);
		}
	}

}
