package Tekcollections;

import java.util.ArrayList;

public class NonPrimitiv {
public static void main(String[] args) {
	ArrayList ls= new ArrayList();
	Employee e1= new Employee(1,"Smith", 200);
	ls.add(e1);
	Employee e2= new Employee(2,"Jhon", 300);
    ls.add(e2);
	Employee e3= new Employee(3,"Reka", 400);
	ls.add(e3);
	System.out.println("No of emp"+ls.size());
	System.out.println(ls);
	
}
}

 class Employee
{
	int eid;
	String name;
	double salary;
	public Employee(int eid, String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	
		}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	//public String toString()
	//{
//		System.out.println(this.eid);
//		System.out.println(this.name);
//		System.out.println(this.salary);
//		return " ";
//		
	
}

