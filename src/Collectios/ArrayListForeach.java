package Collectios;
import java.util.ArrayList;

public class ArrayListForeach {

	public static void main(String[] args) {
        ArrayList<Object> a=new ArrayList<>();
        a.add(10);
        a.add(false);
        a.add('a');
        a.add("Hello");
        a.add(78.98);
        for(Object o:a)
        {
        	System.out.println(o);
        }
        		
	}

}
