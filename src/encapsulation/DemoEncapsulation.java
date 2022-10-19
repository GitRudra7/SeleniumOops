package encapsulation;

import java.util.Scanner;

class Salary
{
	private int sal = 12000,ta,da,pf;
	Scanner sc = new Scanner(System.in);
	
	private void displaySal() 
	{
	 System.out.println(" Enter the choice as, for HR press 1 and for others press 0");
	 int cho = sc.nextInt();
	 if ( cho == 1)
	 {
		 System.out.println("Salary of HR  = " + (sal + ta + da + pf));
	 }
	 else
	 {
		 System.out.println("Salary of other = " + (sal+pf));
	 }
	 
	  
	 
	}
	public void callSal()
	 
	 {
		 System.out.println("Enter TA");
		 ta = sc.nextInt();
		 System.out.println("Enter DA");
		 da = sc.nextInt();
		 System.out.println("Enter pf");
		 pf = sc.nextInt();
		 displaySal();              // private mthd can be called in the same class
		 
	 }
	 
	
	
}

public class DemoEncapsulation {

	public static void main(String[] args) 
	{
		Salary sc = new Salary();
		sc.callSal();

	}

}//task >> accept marks n calculate tot n per
