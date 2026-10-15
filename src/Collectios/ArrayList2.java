package Collectios;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		
		//add(object o)
		a.add(10);
		a.add("Seema");
		a.add(89.98);
		a.add(true);
		a.add(10);
		a.add(89.98);
        System.out.println(a);
        System.out.println("---------------");
        
        ArrayList<Object> b=new ArrayList<>();
        
		//add(object o)
		b.add(12);
		b.add("Gururaj");
		b.add(false);
		b.add('$');
		b.add(543.87);
        System.out.println(b);
        System.out.println("---------------");
        a.addAll(b);
        System.out.println(a);
        System.out.println("------------------");
        
        //containsAll(collection c)
        System.out.println(a.containsAll(b));
        System.out.println(b.containsAll(a));
        System.out.println("-------------");
        
        //removeAll(collection c)
        System.out.println(a.removeAll(b));
        System.out.println(a.containsAll(b));
        System.out.println("------------------");
        
        //addAll(int index,collection c)
        a.addAll(2, b);
        System.out.println(a);
	}

}
