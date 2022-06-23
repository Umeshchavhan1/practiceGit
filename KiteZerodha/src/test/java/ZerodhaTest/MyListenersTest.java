package ZerodhaTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Driver;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.XL;

@Listeners(TestListeners.class)

public class MyListenersTest extends ListenersBaseTest {
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		driver=Driver.openbrowser();
	}
	@Test
    public void ValidCredential() throws EncryptedDocumentException, IOException, InterruptedException {
			ZerodhaLoginPage login=new ZerodhaLoginPage(driver);		
			String username= XL.getdata("UM",0, 1);
			String password= XL.getdata("UM",1, 1);
			login.EnterId(username);
			login.EnterPassword(password);
			login.Enterlogin();
			Thread.sleep(2000);
			ZerodhaPinPage pinpage=new ZerodhaPinPage(driver);
			String pincode=XL.getdata("UM",2, 1);
			pinpage.EnterPin(pincode);
			pinpage.EnterCoutinue();
			
			ZerodhaLoginPage work=new ZerodhaLoginPage(driver);
			work.Enterorder();Thread.sleep(1000);
			work.EnterGtt();Thread.sleep(1000);
			work.EnterNewGtt();Thread.sleep(2000);
			
        
			Actions action=new Actions(driver);
			WebElement search=driver.findElement(By.xpath("(//input[@icon='search'])[2]"));
			action.moveToElement(search).click().perform();Thread.sleep(1000);
			action.sendKeys("LiCi").perform();Thread.sleep(1000);
			WebElement ct=driver.findElement(By.xpath("//li[@class='search-result-item selected']"));
			action.click(ct).perform();
			work.EnterCreateGtt();
			
			
			
			//Assert.assertEquals(driver.getTitle(),"Kite - Zerodha's fast and elegant flagship trading platform");

		}
	@Test
	public void ForgotPage() throws InterruptedException {
		ZerodhaLoginPage pinpage=new ZerodhaLoginPage(driver);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 pinpage.Enterforgot();
	}
	@Test
	public void SignupPage() throws InterruptedException {
		ZerodhaLoginPage signup=new ZerodhaLoginPage(driver);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 signup.EnterSignup();
	}
}
