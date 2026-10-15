package Tekcollections;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class Set1 {

	public static void main(String[] args) {
  Set st=new HashSet();
  st.add("java");
  st.add(34);
  st.add(null);
  st.add(true);
  System.out.println(st);
  st.remove(null);
  System.out.println(st);
  
	}

}
