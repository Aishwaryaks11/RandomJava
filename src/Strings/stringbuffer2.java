package Strings;

public class stringbuffer2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=sb1;
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.hashCode()==sb2.hashCode());


	}

}
