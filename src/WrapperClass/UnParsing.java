package WrapperClass;

public class UnParsing {

	public static void main(String[] args) {
    String s="7654329";
    int a=Integer.parseInt(s);
    System.out.println(s+" "+a);
    String s1="57543.97546";
    double d=Double.parseDouble(s1);
    System.out.println(s1+" "+d);
    String s2="true";
    boolean b=Boolean.parseBoolean(s2);
    System.out.println(s2+" "+b);
    String s3="Hello";
    boolean b1=Boolean.parseBoolean(s3);
    System.out.println(s3+" "+b1);
	}

}
