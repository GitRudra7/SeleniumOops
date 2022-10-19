package abstarction;

// Abstraction main purpose = Hiding Implementation from user and only highlighted part is displayed
				// Adv = Security and enhancement
				// Implementation of this funda is done using overriding 
                //                  1. Abstract classes 
				//					2. Interfaces												
// Abstract class =  0 to 100% work done 
// Interface = 100% task is done

abstract class Animal
{
	abstract void sound(); //abstract contains only declaration, no code is implemented inside an abstract mthd. so it is terminated.
}						   //Here if u can see , the containt's of the abstract mthd are not found or not displayed.
						   //So it is written or hidden somewhere else ,ie in another class, here Dog n Lion

class Dog extends Animal  // ur classes shld always extends the abstract class
                          // as soon as u extends to parent abstract class, it will mandatorily ask u 
                          // to override the mthds of parent class.
{						  // and so we use the override funda in main class, ie ref. of parent and obj. of child

	@Override
	void sound()         
	{
		System.out.println("Bark");
	}
}

class Lion extends Animal
{   
	@Override
	void sound()
	{
		System.out.println("Roaring");
	}
}

//Dog n Lion extends Animal is heirarchial Inheritance

public class DemoAbstraction
{

	public static void main(String[] args)
	{
		Animal d = new Dog();  // overriding funda is used here, here object of abstract mthd is not created as it is useless
		//Dog d = new Dog();   // this is also valid
		d.sound();
		Animal l = new Lion();
		l.sound();

	}

	// Task >> Abstarct class atm...display bal 
}
