package polymorphism;


// polymorphism == many forms ie same object having different behaviour
// eg void person (trainer)
//    void person (student)
//	  void person (friend)

//Types of polymorphism
//		1. Compile Time (Early Binding or static polymorphism)
//			-It exist at the time of compilation.
//			-Can be achived using Method overloading (same mthd name but diff parameters)
//			-Method overloading = When a class contains more than 1 method with same name & diff paam.
//      2. Run time (Late Binding or Dynamic polym)

public class Demooverloading 

{

	void add () 
	{
		int a = 12, b= 12;
		int c = a+b;
		System.out.println(c);
	}
	
	void add (int a , int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	void add (double a, int b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		
//		Demooverloading d = new Demooverloading();
//		d.add();d.add(12, 20);d.add(12.2, 20);
//	    main(); // no need to create obj to call this main mthd, as main mthd is static
     System.out.println("this is original main mthd");
	}
	public static void main()
	{
		Demooverloading d = new Demooverloading();
		d.add();d.add(40, 20);d.add(12.2, 40);
	}

}// Task >> Find area of square, rect ,triangle
// can we overload main()?? RND
// Yes it can be achieved, but although we hv two main mthds, JVM by default will run main mthd with Sring[] args
//as it is the original main mthd.