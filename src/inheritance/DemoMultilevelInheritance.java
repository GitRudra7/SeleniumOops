package inheritance;

class GrandParent
{
	public void etics()
	{
	 System.out.println("Ethics....");	
	}
}

class Parent1 extends GrandParent // class names cannot be repeated in the same package, so Parent n Child r not valid
{
	public void manners()
	{
	  System.out.println("manners....");
	  
	}
}

class Child1 extends Parent1
{
	public void learning()
	{
	System.out.println("Learning...");	
	}
}

public class DemoMultilevelInheritance
{

	public static void main(String[] args)
	{
		Child1 c = new Child1();
		c.etics();
		c.manners();
		c.learning();
	}

}
