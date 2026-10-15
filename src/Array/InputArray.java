package Array;
import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Before Entering Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Elements");
			a[i]=sc.nextInt();
		}
    
		System.out.println("Entered Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
	}
}
