package inheritance;

class Parent
{
	public void teaching()  // all code is written within a method only, cannot be written in class directly
	                        // but u can directly declare or initialize the varbs. inside a class 
	{
		System.out.println("Teaching....");
	}
}

class Child extends Parent
{
	public void studying() 
	{
		System.out.println("Studying....");
	}
}

public class DemoSingelInheritance
{

	public static void main(String[] args)
	{
		Child c = new Child(); // c is the object of subclass child
		c.teaching();          // use object to call any method or varb. from a class
		c.studying();          // mostly we create the object of subclass, as parent methods & varbs can also be accessed
		
		
	}

}
