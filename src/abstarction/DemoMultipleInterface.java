package abstarction;

import java.util.Scanner;

interface c1
{
	void add ();
	
}

interface c2 
{
	void sub();
}


public class DemoMultipleInterface implements c1,c2 // class can implement multiple interfaces & class can extends single class.
												// This shows multipleInheritance can be achieved using interfaces .
{												
	int a,b;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 nos.");
		DemoMultipleInterface d = new DemoMultipleInterface();
		d.a= sc.nextInt();
		d.b = sc.nextInt();
		sc.close();
		d.sub();
		d.add();
	}


	@Override      	// Interface is always overriden inside the implementing class, here it is main class
	public void sub()
	{
		
		System.out.println(a-b);
	}


	@Override
	public void add()
	{
		System.out.println(a+b);
	}

	
	
}

//
//interface c3 extends c2  // interface can extends 2 or more interfaces but cannot implement interface
//
//{
//	
//}
//
//interface c4 implements c1 //interface cannot implement interface
//{
//	
//}
//
//interface c3 extends DemoMultipleInterface // Interface cannot extends class
//{
//	
//}
// 



