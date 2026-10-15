package Collectios;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		//add(object o)
		a.add(10);
		a.add("purnita");
		a.add(89.98);
		a.add(true);
		a.add(10);
		a.add(89.98);
		a.add(10);
        System.out.println(a);
        System.out.println("---------------");
        
        //size()
        System.out.println(a.size());
        System.out.println("-------------");
        
        //get()
        System.out.println(a.get(0));
        System.out.println(a.get(3));
        System.out.println(a.get(5));
        System.out.println("---------------------");
        
        //contains(object o)
        System.out.println(a.contains(67));
        System.out.println(a.contains(true));
        System.out.println(a.contains(89.98));
        System.out.println("------------------------");
        
        //remove(int index)
        System.out.println(a.remove(2));
        System.out.println(a.remove(3));
        System.out.println(a.remove(4));
        System.out.println(a);
        System.out.println("---------------------");
        
        //isEmpty()
        System.out.println(a.isEmpty());
        System.out.println("--------------------------");
        
        //clear()
        a.clear();
        System.out.println(a.isEmpty());
	}

}
