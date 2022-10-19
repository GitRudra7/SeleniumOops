package variations;

public class DemoVariable
{
   
    int a = 21; // non static or instance varb (varb declared outside a mthd).
    static int b = 22; //static varb.
    
	public void locaVariable()
	{
	 int c =12;// local varb.
	 System.out.println("Local varb = " + c);
	 System.out.println("Static varb = " + b); //static varb. can be directly called in a static or non static mthd
	 System.out.println("Instance varb = " + a);// instance varb can be directly called in non static mthd.
	}
	
	
	public static void main(String[] args)
	{
		DemoVariable d = new DemoVariable();
		d.locaVariable();  // to call local varb. ,call the local method 1st
		System.out.println("Instatnce varb " + d.a); // to call instance varb. use object
		System.out.println("Static varb. " + b); // static varb. can be directly called in static or non static mthd

	}

}
