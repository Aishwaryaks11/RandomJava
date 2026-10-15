package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Modification {

	public static void main(String[] args) {
    ArrayList<Object> a=new ArrayList<>();
    a.add(10);
    a.add(false);
    a.add('a');
    a.add("Hello");
    a.add(78.98);
    Iterator<Object> i=a.iterator();
    while(i.hasNext())
    {
    	Object res=i.next();
    	if(res.equals(false))
    	{
    		i.remove();
    	}
    }
    System.out.println(a);
	}

}
