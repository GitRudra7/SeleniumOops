package day1;

import encapsulation.DemoProtected; // gets automatically imported as soon as u write extends.

public class CallingProtectedMethodType2 extends DemoProtected
{

	public static void main(String[] args) 
	{
		CallingProtectedMethodType2 d1 = new CallingProtectedMethodType2(); // 
		d1.protectedMethod();
   
	}

} // here no need to create the object of DemoProtected class or rather it is illogical
  // since the class CallingProtectedMethodType2 is subclass of DemoProtected class , so by default u can access 
  // all the methods and variables of DemoProtected class into CallingProtectedMethodType2 class.
  // We always creates the object of subclass and not that of ParentClass
  // This also shows us that the subclass and ParentClass can exist in different Packages
