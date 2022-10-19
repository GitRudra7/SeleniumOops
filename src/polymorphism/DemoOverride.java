package polymorphism;

//2. Run time (Late Binding or Dynamic polym) - exists at the time of execution of program
//   we can achieve Run Time Polymorphism by method Overriding
//   Whenever we write method in Parent and child class in such a way that method name and parameter must be same.


class Vehicle 
{
	public void run() 
	{
	System.out.println("All vehicles run");	
	}
}

class Car extends Vehicle
{
	@Override //Indicates that a method declaration here is intended to override a method declaration in a supertype.
	public void run() 
	{
	  super.run();   ///***************** VERY IMP **********************////
	  System.out.println("Car is running");
	}
}


public class DemoOverride {

	public static void main(String[] args)
	{
	//	ref. of parent and obj. of child
		
		Vehicle c = new Car(); //  child obj can override the parent but vise versa not psbl.
		//Vehicle v = new Vehicle(); // this is usual way
		//Car vh = new Vehicle(); // vise versa not psbl
		//Car ch = new Car();		  // this is usual way	
		c.run();
		//v.run();
		//vh.run();
		//ch.run();
		
	}
  
}// Task >> can we override main () ?? RND 
