package encapsulation;

public class CallingProtectedMethod
{

	public static void main(String[] args) 
	{
		DemoProtected d = new DemoProtected(); // u hv to create the object of that class whose mthd is to b called, so here create the object of DemoProtected class
		d.protectedMethod();// u can see the mthd is accessible, as both the class CallingProtectedMethod and DemoProtected are in the same Package ie encapsulation
		
	}

}// Now chk whether this protected method is accessible in day1 package or not, 
 //so 1st chk CallingProtectedMethodType1 class in day1 package
