package inheritance;

import java.util.Scanner;

// Accept 2 nos. n find the greater
// Accept 2 nos. n display even odd, +ve -ve, Reverse
// This are the examples of Multilevel Inheritance

class Accept 
{
  int a,b;
  public void acceptInput()
  {
	  
	System.out.println("Enter 2 nos.");  
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	sc.close();
	
  }
  
}
  
class Greater extends Accept
{
	public void greater() 
	{
	 if ( a>b)
	 {
		System.out.println("the no " + a + " is greater than " + b); 
	 }
	 else
		 System.out.println("the no " + b + " is greater than " + a);
	}
}

class Checker extends Greater // if u do Checker extends Accept, then u hv to call acceptInput() mthd again, 
							  // b4 calling checker() mthd			
{
	public void checker() 
	{
	  if (a%2==0)
	  {
		  System.out.println(a + " is even");
	  }
	  else 
	  {
		  System.out.println(a + " is odd");
	  }
	  
	  if (b%2==0)
	  {
		  System.out.println(b + " is even");
	  }
	  else 
	  {
		  System.out.println(b + " is odd");
	  }
	}
}
   
    
    


public class Task {

	public static void main(String[] args) 
	{
		
    Checker c = new Checker();
    c.acceptInput();
    c.greater();
    c.checker();
    
    // Similarly if u r coding for +ve -ve and reverse , then create the object of last class ie reverse,  
    // or else u hv to call acceptInpu()t method each time.
    
    
     
	

	}

}
