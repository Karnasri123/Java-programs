package quesmaping;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class listhashmap {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> m=new LinkedHashMap();
		m.put("sri",100);//hash map does not allow double keys it will unique
		m.put("ram",101);//values may be duplicate and null
		m.put("raji",102);//there is one null key and one null value possible.
		m.put("srija",101);//it will allows preciding order.
		/*m.put("hanuma",103);
		m.put("laxman",104);
		m.put("sri", 105);
		m.put(null, null);*/
		System.out.println(m);
		System.out.println("-------------------------------------------------");
		System.out.println("-----using entryset-----");
		for(Entry<String,Integer> n:m.entrySet())
		{
			System.out.println(n);
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("------using keyset------");
		for(String h:m.keySet())//using keyset to extract values one by one
		{
			System.out.println(h+"---"+m.get(h));
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("------using iterator with entryset---------");
		Iterator data=m.entrySet().iterator();
		while(data.hasNext())
		{
			System.out.println(data.next());
			
		}
		System.out.println("--------------------------------------------------");
		System.out.println("------using iterator with keyset------");
		Iterator dat=m.keySet().iterator();
		while(dat.hasNext())
		{
			String key=(String) dat.next();
			System.out.println(key+"---"+m.get(key));
		}

	}

}
