package quesmaping;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class linkedmapsimple {
	
	//mapping is based on keys and values
	//it does not allow null keys but allows values as null
	//it does not allows duplicate values

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> m=new LinkedHashMap();
		
		m.put("sri",100);
		m.put("ram",101);
		m.put("raji",102);
		m.put("srija",101);
		m.put("hanuma",103);
		m.put("laxman",104);
		m.put("sri", 105);
		m.put("null", null);
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
