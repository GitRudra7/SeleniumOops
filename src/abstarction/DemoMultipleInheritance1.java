package abstarction;


//MultipleInheritance = > Single subclass with multiple parent classes (opp of hierarchical)
class c8
{
	public void m1()
	{
	 System.out.println("m1 c1");	
	}
}

class c9 
{
	public void m2()
	{
		System.out.println("m2 c2");
	}
}

public class DemoMultipleInheritance1 extends C8,C9  // a class cannot extends multiple classes
{

	public static void main(String[] args)
	{
		
	}

} // This shows multipleInheritance cannot be achieved using normal classes.
  // So we hv to use Interface concept to achieve multiple Inheritance
