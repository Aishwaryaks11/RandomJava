package TekPyramid;

public class Finally1 {

	public static void main(String[] args) {
		try
		{
			System.out.println(1/1);
		}
		
		catch(Exception e)
		{
         System.out.println(e.getMessage());
	}
		finally {
			try
			{
				System.out.println(1/0);
			}
			catch(Exception e)
			{
	         System.out.println(e.getMessage());
		}
		}
	}
}


