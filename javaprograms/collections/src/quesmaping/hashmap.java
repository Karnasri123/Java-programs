package quesmaping;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> m=new HashMap();
		m.put("sri",100);//hash map does not allow double keys it will unique
		m.put("ram",101);//values may be duplicate and null
		m.put("raji",102);//there is one null key and one null value possible.
		m.put("srija",101);
		m.put("hanuma",103);
		m.put("laxman",104);
		m.put("sri", 105);
		//System.out.println(m.values());
		System.out.println(m);
		System.out.println("----------------------------------------------");
		for(Entry<String,Integer> n:m.entrySet())
		{
			System.out.println(n);
		}
		System.out.println("------------------------------------");
		for(Integer h:m.values())
		{
			
			System.out.println(h);
		}

	}

}
