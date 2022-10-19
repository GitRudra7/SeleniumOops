package abstarction;

import java.util.Scanner;


interface Client
{
	void input();
	void output();
	
}

class Developer implements Client // click on developer to get below override mthds
{
   String nm; int sal;
	
	@Override					// Interface is always overridden by the implementing class, here it is Developer
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter name");
		 nm = sc.next();
		 System.out.println("Enter sal");
		 sal = sc.nextInt();
		 sc.close();
		
	}

	@Override
	public void output()
	{
		System.out.println("name" + nm);
		System.out.println("sal " + sal);
	}
	
}


public class DemoInterface 
{
  public static void main(String[] args) 
  
  {
	Client c = new Developer();
	c.input();c.output();
  }
}
