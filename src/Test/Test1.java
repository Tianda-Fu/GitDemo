package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterTest
	// aftertest annotation usually been used to delete cookies after the test cases
	public void lastoperation() {
		System.out.println("I should be the last operaion");
	}

	@Test
	public void Demo() {
		System.out.println("TestNG");
		Assert.assertTrue(false);
	}
	
	@Test
	public void Demo_2() {
		System.out.println("Maven");
		Assert.assertTrue(true);
	}
	
	@AfterSuite
	public void AfSuite() {
		System.out.println("After Suite");
		System.out.println("After Suite");
		System.out.println("After Suite");
		System.out.println("After Suite");
		System.out.println("After Suite");
	}
	
	@Test
	public void Demo2() {
		System.out.println("quit");
	}

}
