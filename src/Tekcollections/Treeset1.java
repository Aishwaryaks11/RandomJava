package Tekcollections;
import java.util.TreeSet;
public class Treeset1 {

	public static void main(String[] args) {
    TreeSet set= new TreeSet();
    set.add(23);
    set.add(15);
    set.add(32);
    //set.add("add"); gives classcast exception
    set.add(67);
    set.add(89);
    System.out.println(set);//it will print output in ascending order
    System.out.println(set.getFirst());
    System.out.println(set.getLast());
    //set.addFirst(22);
  //  System.out.println(set);
    
	}

}
