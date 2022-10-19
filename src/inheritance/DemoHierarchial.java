package inheritance;

// Two or more subclass inherits feature of a superclass

// Example of Hierarchical Inheritance

class SrTrainer
{
	public void subject()
	{
	System.out.println("Automation");	
	}
}

class JrTrainer extends SrTrainer
{
	public void upgrade()
	{
	System.out.println("Upgrading");	
	}
}

class Student extends SrTrainer
{
	public void session() 
	{
	System.out.println("Learning");	
	}
}


public class DemoHierarchial {

	public static void main(String[] args)
	{
	Student s = new Student();
	JrTrainer j = new JrTrainer();
	s.subject();
	s.session();
	j.subject();
	j.upgrade();

	}

}
