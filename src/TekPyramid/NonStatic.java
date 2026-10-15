package TekPyramid;

public class NonStatic {
	public static void m1()
	{
		int a=10;
		int b=20;
		System.out.println("Inside method m1 "+ (a+b));
	}
	static
	{
		m1();
		System.out.println("inside static block");
	}

	public static void main(String[] args) {
    System.out.println("Inside main method");
	}

}
