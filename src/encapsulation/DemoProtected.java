package encapsulation;

// A protected mthd can be called directly in any class within the same package
// But to call a protected mthd into a class of another pacakage, u need to extend that class with the class of that protected method.

public class DemoProtected 
{
    protected void protectedMethod()
    {
	  System.out.println("Im protected mthd");
    }
}
// now chk CallingProtectedMethod class within encapsulation Package
