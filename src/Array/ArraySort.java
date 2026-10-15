package Array;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
    int[] a= {50,40,20,30,10};
    Arrays.sort(a);
    for(int i:a)
    {
    	System.out.println(i);
    }
    System.out.println("-------");
    double[] d= {29.75,78.09,32.87,87.98};
    Arrays.sort(d);
    for(double j:d)
    {
    	System.out.println(j);
    }
    System.out.println("-----------");
    String[] s= {"abc","ghj","agv","cdx"};
    Arrays.sort(s);
    for(String k:s)
    {
    	System.out.println(k);
    }
    }
	}

