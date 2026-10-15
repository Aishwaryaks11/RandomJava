package TekPyramid;

public class FourWayCallStatic {
    static String s;
    static int b;
    public void demo()
    {
    	//calling static variable using this keyword
    	System.out.println(this.s);
    	System.out.println(this.b);
    }
	public static void main(String[] args) {
		
		FourWayCallStatic f=new FourWayCallStatic();
		f.demo();
	}

}
