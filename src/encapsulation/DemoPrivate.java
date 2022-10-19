package encapsulation;

// Private mthd cannot be accessed outside the class in which it is created.
class PrivateDemo
{
	private void privateMethod1() 
	{
	 System.out.println("Private method 1");	
	}
}

public class DemoPrivate
{
	private void privateMethod2() 
	{
		System.out.println("Private Method 2");
	}
	
 
	public static void main(String[] args)
	{
		DemoPrivate m2 = new DemoPrivate();
		m2.privateMethod2();                    // accessible
	//	PrivateDemo m1 = new PrivateDemo();
	//	m1.privateMethod1();                    // not accessible
	}

}
