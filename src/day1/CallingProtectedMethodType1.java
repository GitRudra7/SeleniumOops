package day1;

import encapsulation.DemoProtected;

public class CallingProtectedMethodType1 
{

	public static void main(String[] args) 
	{
		DemoProtected d = new DemoProtected();
		//wrong stm >>> u can see the class DemoProtected itself is not accessible , so u cannot call its mthd as well.
		//ryt one >>> type Demo then cntrl + space....then the class can be accessed or it will be imported.
		
		d. //chk u cannot see the method protectedMethod() in template after ' . ' 	, so mthd is not accessible.
	}

}// Now chk CallingProtectedMethodType2 class in day1 package.
