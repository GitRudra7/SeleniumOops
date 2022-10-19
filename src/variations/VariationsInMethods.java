package variations;

public class VariationsInMethods 
{  
	//below 4 are non static mthds
	
	//methods with void type no param
	public void methodVoid()
	{
	  System.out.println("method without parametes and void type");	
	}
	//methods with void type and param
	public void methodVoidParam(int a) 
	{
	  System.out.println("method void with parameter " + a);	
	}
	//method with int type no param......types other than void must include return
	public int methodInt() 
	{
		int a=2,b=3; int c = a+b;
		System.out.println("non void method with int type and non param " + c);
		return c; 			// THERE SHLD BE NO STMTS AFTER return 
		
	}
	//method with int type and param
	
	public int methodIntParam(int a , int b)
	{
		int c = a+b;
		System.out.println("method is of IntType and 2 params and result is " + c);
		return c;
		
	}
	
	//A static mthd doesnt req. obj or any variable to call, can be called directly or through class name.
	// All the above 4 types can be made static too using static keyword.
	
	public static void methodStatic()
	{
		System.out.println("This is static method with void type");
	}
	
	

	public static void main(String[] args) 
	{
		// To create object do as
		// Class_name varb_as_object = new Class_name();
		VariationsInMethods v = new VariationsInMethods();
		v.methodVoid(); //obj_name.method_name .....to call a method.
		v.methodVoidParam(5);
		v.methodInt();
		v.methodIntParam(5,2);
		methodStatic(); // can be called directly
		VariationsInMethods.methodStatic(); //or through class name
		
		

	}

}
