package Tekcollections;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhash1 {

	public static void main(String[] args) {
    LinkedHashSet set= new LinkedHashSet();
     set.add(56);
     set.add("java");
     set.add(67);
     set.add(null);
     set.add(true);
     set.add('A');
     set.add('A');
     System.out.println(set);
     System.out.println(set.getFirst());
     set.addFirst("First");
     set.addLast("Last");
     System.out.println(set.reversed());
     System.out.println(set);
	}

}
