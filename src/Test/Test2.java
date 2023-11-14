package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = {"smoke"})
	public void Forza() {
		System.out.println("Forza Motorsports");
	}
	
	@Test(groups = {"smoke"})
	public void F1() {
		System.out.println("Formular 1");
	}
	
	@Test(groups = {"smoke"})
	public void GT() {
		System.out.println("Gran Turismo");
	}
	
	@BeforeTest
	public void preprocessing() {
		System.out.println("I have to execute first");
	}

}
