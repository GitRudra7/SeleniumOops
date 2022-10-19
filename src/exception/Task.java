package exception;

public class Task 
{

	public static void main(String[] args) 
	{
		int a[] = {10,20,0,25,50}, b = 100, c;
		int n = a.length;
		System.out.println("The Result is ");
		for (int i=0; i < n; i++)
		{
			try
			{
			c=b/a[i];
			System.out.println(c);
		    }
			catch (Exception e)
			{
				System.out.println("Number at index value "+ i + " cannot be divded by 0");
			}
		
	    }
		System.out.println("Program Exit");

}
}
