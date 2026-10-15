package Array;

public class BeforeData {

	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println("Before Entering Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
        a[0]=10;
        a[4]=50;
        a[3]=40;
		System.out.println("After Entering Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}


	}

}
