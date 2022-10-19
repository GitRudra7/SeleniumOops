package day1;

import encapsulation.DemoPublic;

public class CallingPublicMethod {

	public static void main(String[] args)
	{
		DemoPublic dpp = new DemoPublic();
		dpp.publicMethod(); // mthd is accessible in another package

	}

}
