package FaceBook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Driver;
import POM.FBLogin;

public class LoginPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browser(){
	driver= Driver.openbrowser();}
	@Test
	
	public void EnterLogin() {
		
		
		FBLogin f1= new FBLogin();
		f1.entermail("omiumesh149@gmail.com");
		f1.enterpass("Umesh123");
		f1.clickLogin();
		
	}

}
