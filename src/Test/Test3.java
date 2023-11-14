package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	@BeforeClass
	public void BfClass() {
		System.out.println("before executing any methods in this class");
	}
	
	@Test(dataProvider = "getData")
	public void WebLoginRacing(String username, String password) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Parameters({"URL", "APIKey"})
	@Test
	public void MobileLoginRacing(String urlname, String key) {
		// Appium
		System.out.println("mobilelogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(enabled = false)
	public void MobileSignInRacing() {
		// Appium
		System.out.println("mobile signin");
	}
	
	@BeforeSuite
	public void BfSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterMethod
	public void AfMethod() {
		System.out.println("Print Everytime after methods");
		
	}
	
	@BeforeMethod
	public void BfMethod() {
		System.out.println("Print Everytime before methods");
	}
	
	@Test(groups = {"smoke"})
	public void MobileSignOutRacing() {
		// Appium
		System.out.println("mobile signout");
	}
	
	@Test(dependsOnMethods = {"WebLoginRacing", "MobileSignInRacing"})
	public void APIRacing() {
		// Rest API automation
		System.out.println("APIlogincar");
		System.out.println("Web automation");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password - good credit history
		// 2nd combination - username password - no credit history
		// 3rd combination - fraudelent credit history
		Object[][] data = new Object[4][2];
		// 1st
		data[0][0] = "fristsetusername";
		data[0][1] = "password";
		// columns in the row are nothing but values of that particular combination
		
		// 2nd
		data[1][0] = "secondsetusename";
		data[1][1] = "secondpassword";
		
		// 3rd
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		// 4th
		data[3][0] = "fourthsetusername";
		data[3][1] = "fourthpassword";
		
		return data;
	}

}
