package TekPyramid;
//calling non static variables from non static context 

public class CallingNon {
    int a;
    public void demo()
    {
    	System.out.println(a);
    	System.out.println(this.a);
    	 CallingNon c=new CallingNon();
     	System.out.println(c.a);
    }
	public static void main(String[] args) {
		
     CallingNon c=new CallingNon();
     c.demo();
	}

}
