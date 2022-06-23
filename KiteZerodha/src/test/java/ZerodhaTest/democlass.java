package ZerodhaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import POJO.Driver;
import POM.demoo;

public class democlass {
	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver=Driver.openbrowser();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	}
	@Test
	public void FillForm() {
		demoo ft=new demoo();
		ft.EnterEmail("Umesh123@gmail.com");
		ft.EnterName("Umesh");
		ft.EnterLastname("Chavhan");
		ft.EnterAge("25");
		ft.EnterRadio();
		ft.EnterCity("pune");
		ft.EnterState("Maharashtra");
		ft.EnterPin("1234");
		ft.EnterRJ();
		ft.EnterSoft();
		ft.EnterTV();
		
	
	
	
	
}

	
}