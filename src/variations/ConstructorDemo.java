package variations;
// Constructor = 1.Basically a mthd that is called or Invoked automatically at the time of obj. creation. 
//				 2.shld be same as classname
//				 3.Parameterised and non parameterised constructor
//				 4.Constructor does not return any value	


public class ConstructorDemo
{
	 
  int no; String nm;  // non static or instance varbs are declared here, 
                     //which can be used directly in below non static mthds. ie constructors.
  
  public ConstructorDemo() //non parameterised or zero constructor
  {
	 no = 23;
	 nm = "Rud";
	 System.out.println(no + nm);
	 
  }
  public ConstructorDemo(int no , String nm) // parameterised constructor with same varbs. name as that of 
  {											 // instance varbs.
	  this.no = no;							 // so we hv to 'this' keyword  (just as 'self'in python)
	  this.nm = nm;                          // which will distinctly identify the instance varbs of class
	
	  
  }
  public ConstructorDemo(int x , String y, int z) //parameterised constructor with varbs. diff than instance varbs.
  {
	no = x;
	nm = y ;
	System.out.println(no + nm + z);
	  
  }
  // In above we can see eg of method overloading ie same mthd name is used 3 times but with diff. params.
	
	
	
	public static void main(String[] args)
	{
		ConstructorDemo d  = new ConstructorDemo();//calling of non parameterised const.
				
		ConstructorDemo c = new ConstructorDemo(22,"rud");// calling parameterised const. with 2 varbs
		System.out.println(c.no + c.nm);
		
		ConstructorDemo e =  new ConstructorDemo(24,"Rud",24);// calling parameterized with 3 varbs
		
		// *******Imp point******//
		
		// There is no need to use a variable for object creation,
		// U can directly create an object , if its variable is used nowhere, as d and e in above case
		// This d and e are just consuming memory unnecessarily
		// simply write >>> new Class_name(); >>>>>this will be your object. as shown below;
		
		new ConstructorDemo();              // non param object
		new ConstructorDemo(25,"Rud",25);   // parameterized object
	

	}

}
