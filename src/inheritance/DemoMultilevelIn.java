package inheritance;

import java.util.Scanner;

// working on both mthd n varbs.

class Addition
{
	
	int a , b ;
	public void add() 
	{
	System.out.println("Addition is = " + (a+b));	
	}
}

class Substraction extends Addition
{
	public void sub()
	{
	 System.out.println("Substraction = " + (a-b));	// if extends is not used then a & b cannot be accesed here
	}
}

class Multiply extends Substraction
{
	public void mul() 
	{
		System.out.println("Multiplication is " + (a*b));
	}
}

public class DemoMultilevelIn {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos.");		
		Multiply m = new Multiply();
		m.a= sc.nextInt(); // calling varbs. using obj. 
		m.b= sc.nextInt(); // To access varbs or mthds from 1 class to another class , always use object.
		sc.close();
		m.add();		   // calling mthds using obj.
		m.sub();
		m.mul();
		

	}// Accept 2 nos. n find the greater
	// Accept 2 nos. n display even odd, +ve -ve, Reverse

}
