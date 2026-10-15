package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
    ArrayList<Object> a= new ArrayList<>();
    {
    	a.add(10);
    	a.add(false);
    	a.add('a');
    	a.add("Hello");
    	a.add(78.98);
    	
    	Iterator<Object> i=a.iterator();
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
    }
	}

}
