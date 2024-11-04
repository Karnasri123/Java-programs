package quesmaping;

import java.util.HashMap;
import java.util.Iterator;

public class cursorofmap {

	public static void main(String[] args) {
		HashMap<String,Integer> m=new HashMap();
		m.put("sri",100);//hash map does not allow double keys it will unique
		m.put("ram",101);//values may be duplicate and null
		m.put("raji",102);//there is one null key and one null value possible.
		m.put("srija",101);
		m.put("hanuma",103);
		m.put("laxman",104);
		m.put("sri", 105);
		for(String h:m.keySet())//using keyset to extract values one by one
		{
			System.out.println(h+"---"+m.get(h));
		}
		System.out.println("-------------------------------------------------------------");
		Iterator data=m.entrySet().iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
			
		}
		System.out.println("--------------------------------------------------");
		Iterator dat=m.keySet().iterator();
		while(dat.hasNext())
		{
			String key=(String) dat.next();
			System.out.println(key+"---"+m.get(key));
		}
		

	}

}
