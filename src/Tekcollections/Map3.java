package Tekcollections;
import java.util.TreeMap;
public class Map3 {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(11, "Ram");
		t.put(22, "Sita");
		t.put(33, 66);
		t.put(44, null);          //Value as null will accept
		//t.put("Java",33); ----// Get classcast exception bcz of heterogenious
       // t.put(null,0); ----------//Key as null will give nullpointer exception
        System.out.println(t);
        System.out.println(t.firstEntry());
        System.out.println(t.lastEntry());
        System.out.println(t.firstKey());
        System.out.println(t.lastKey());
	}

}
