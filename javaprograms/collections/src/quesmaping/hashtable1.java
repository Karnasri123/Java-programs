package quesmaping;

import java.util.Hashtable;
import java.util.Map.Entry;

public class hashtable1 {

	public static void main(String[] args) {
		Hashtable<String,Integer> m=new Hashtable();
		m.put("sri",100);//linked hash map does not allow double keys it will unique
		m.put("ram",101);//values may be duplicate and null
		m.put("raji",102);//there is one null key and one null/not a null value possible.
		m.put("srija",101);// order of precision is allowed.
		m.put("hanuma",103);
		m.put("laxman",104);
		m.put("sri", 105);
		m.put(null, 105);
		//System.out.println(m.values());
		System.out.println(m);
		System.out.println("----------------------------------------------");
		


	}

}
