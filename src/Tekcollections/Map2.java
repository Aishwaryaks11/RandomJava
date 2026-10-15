package Tekcollections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class Map2 {

	public static void main(String[] args) {
		LinkedHashMap<Object,Object> l=new LinkedHashMap<>();
		l.put(11, "java");
		l.put(22, "sql");
		l.put(33,"kite");
		l.put(44, "script");
		l.put(55, "postman");
		l.put(33,"post");
		System.out.println(l);
		System.out.println();
		//duplicate not allowed
		l.putFirst(66, "ram");
		System.out.println(l);
		System.out.println();
		l.putLast(77, "sita");
		System.out.println(l);
		System.out.println();
		System.out.println(l.firstEntry());
		System.out.println();
		System.out.println(l.lastEntry());
		System.out.println();
		for(Entry<Object,Object> ref:l.entrySet())
		{
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
		
		
		

	}

}
