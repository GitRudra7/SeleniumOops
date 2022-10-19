package inheritance;

class Employee
{
	float sal = 50000;
}
class Tester extends Employee
{
	int bonus = 20000;
}

public class DemoRelation {

	public static void main(String[] args)
	{
		Tester t = new Tester();
	    System.out.println("Salary of tester = " + t.sal);// use object to call any method or varb. from a class
	    System.out.println("Bous of tester = " + t.bonus);

	}

}
