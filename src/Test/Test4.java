package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test(groups = {"smoke"})
	public void WebLoginHome() {
		// selenium
		System.out.println("webloginhome");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileLoginHome(String name) {
		// Appium
		System.out.println("mobileloginhome");
		System.out.println(name);
	}
	
	@Test
	public void LoginAPIHome() {
		// Rest API automation
		System.out.println("APIloginhome");
	}

}
