package exception;

public class DemoExecption {

	public static void main(String[] args)
	
	{
		
		int a = 0 , b=12,c;
		
//		c=b/a;
//		System.out.println(c);
		
		try
		{
		c=b/a;
		System.out.println(c);
		}
		catch (Exception e)
		{
		System.out.println("Number not divisible by 0");
		}
		
		System.out.println("Program exit"); // Adv of exception handling ie try n catch is that, this stm will get ,
											// executed even after the exception has occured
		
	}
	
 // Task >>>handle array exception
	

	
}
