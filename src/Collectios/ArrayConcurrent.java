package Collectios;
import java.util.ArrayList;

public class ArrayConcurrent {

	public static void main(String[] args) {
        ArrayList<Object> a=new ArrayList<>();
        a.add(10);
        a.add(false);
        a.add('a');
        a.add("Hello");
        a.add(78.98);
        for(Object o:a)
        {
        	if(o.equals('a'))
        		{
        			a.add(o);
        		}
        	
        	System.out.println(o);
        }
        		
	}
	
}
