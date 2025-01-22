package Selinium;



//Priority

//If we Ignore any test so we can use the Word Ignore before method or before class

import org.testng.annotations.Test;

public class FlightTheBook {

	@Test(enabled = false)
	public void login() {
		System.out.println("Login is successfull");
	}

	@Test(priority = 1)
	public void signup() {
		System.out.println("Signup is successfull");
	}

	@Test(priority = 3)
	public void search() {
		System.out.println("Search is successful");
	}

	@Test(enabled = false)
	public void Booktheflight() {

		System.out.println("Booktheflight is successful");
	}

	@Test(priority = 5)
	public void Departingposition() {

		System.out.println("Depart  is successful");
	}

}
