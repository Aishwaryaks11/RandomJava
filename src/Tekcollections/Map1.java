package Tekcollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args) {
		Map<Object, Object> m=new HashMap<>();
		m.put("RCB", 21);
		m.put("CSK", 42);
		m.put(23, "SRH");
		m.put(77, "just");
		m.put(null, "csk");// case sensitive
		m.put(true, false);
		System.out.println(m);
		m.put("RCB", 18);   //it will replace old value
		System.out.println(m);
		System.out.println("-------------------------");
		System.out.println("ContainsKey() ------ return boolean");
		System.out.println(m.containsKey("SRH"));
		System.out.println(m.containsKey("RCB"));
		System.out.println("-------------------------");
		System.out.println("ContainsValue() ------ return boolean");
		System.out.println(m.containsValue("csk"));
		System.out.println(m.containsValue("RCB"));
		System.out.println("-------------------------");
		System.out.println("Get all Key in map");
		System.out.println(m.keySet());
		System.out.println("-------------------------");
		System.out.println("Get all Value in map");
		System.out.println(m.values());
		System.out.println("Total key value present");
		System.out.println(m.size());
		System.out.println("--------------------");
		System.out.println(m);
		System.out.println("remove");
		m.remove(77);
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.get("RCB"));
		System.out.println("-----------------------------");
		System.out.println();
		for(Entry<Object,Object> ref:m.entrySet())
		{
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
		
		
		//Key      Value
//         RCB        18
//         CSK        42
//         23        SRH
//         null       csk
	}

}
