package polymorphism;

public class TaskOverride
{

	public static void main(String[] args) 
	{
		
		
//		TaskOverride c = new Child();
		
		main(args); 
		System.out.println("this is mthd in parent class");
		
		
	}

}

class Child extends TaskOverride
{
	public static void main(String[] args) 
	{
		System.out.println("this is mthd in child class");  
	
		 
	}
	

}
// this shows overriding the main mthd cannot be achived



