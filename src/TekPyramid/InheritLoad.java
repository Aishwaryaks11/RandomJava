package TekPyramid;


class Parent
{
	static int a=10;
	static int b;
	static
	{
		a=20;
		b=30;
		System.out.println("parent success");
	}
	static void parentMethod()
	{
		System.out.println("parent mrthod");
	}
}

class Child extends Parent 
{
	static int c;
	static int d=5;
	static
	{
		a=50;
		b=77;
		c=34;
		d=29;
		System.out.println("child success");
	}
	static void childMethod()
	{
		System.out.println("child method");
	}
}

public class InheritLoad {
public static void main(String[] args) {
	//Parent.parentMethod();
	System.out.println(Child.a);
	System.out.println(Child.b);

}
}
