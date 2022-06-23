package ZerodhaTest;

import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.Options;

import POJO.Driver;
import POM.ZerodhaFindTest;
import POM.ZerodhaForgotPasswordTest;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.ZerodhaSignUpPage;
import Utility.Sreenshot;
import Utility.XL;

@Listeners(TestListeners.class)

public class LoginTest {
	
	WebDriver driver;

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
		 
		//Sreenshot.getSreenShot(driver,"SS1");
		pinpage.EnterCoutinue();
		//Sreenshot.getSreenShot(driver,"SS2");
		//Thread.sleep(1000);
		
		Set<String> set=driver.getWindowHandles();
		 java.util.Iterator<String> window = set.iterator();
		 
		 while(window.hasNext()) {
			 String value=window.next();
			 driver.switchTo().window(value);
		 
			 if(driver.getTitle().equals("Dashboard/Kite")){
				 driver.findElement(By.linkText("//input[@icon='search']"));
			 } 
			 
			 
	  
		ZerodhaFindTest Homepage =new ZerodhaFindTest(driver);
        Homepage.Search("TATAMOTORS");
        
        Homepage.EnterList();
		Thread.sleep(1000);
	    Homepage.EnterBuy();Thread.sleep(1000);
	   // Homepage.EnterCancel();Thread.sleep(1000);
//		Homepage.EnterSell();
		Homepage.ClickOnMarketRadio();Thread.sleep(1000);
		Homepage.ClickOnLimitRadio();Thread.sleep(1000);
		Homepage.ClickOnSLRadio();Thread.sleep(1000);
		Homepage.ClickOnSLMRadio();
		
//		WebElement listtata=driver.findElement(By.xpath("//li[@class='search-result-item selected isadded']"));
//		action.moveToElement(listtata).perform();
//		Thread.sleep(2000);
//		
//		WebElement buy=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
//	    action.moveToElement(buy).click();
//	    action.perform();
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.xpath("//label[@for='radio-183']")).click();
//	    action.perform();Thread.sleep(1000);
//	    driver.findElement(By.xpath("//label[@for='radio-184']")).click();
//	    action.perform();Thread.sleep(1000);
//	    driver.findElement(By.xpath("//label[@for='radio-186']")).click();
//	    action.perform();Thread.sleep(1000);
//	    driver.findElement(By.xpath("//label[@for='radio-187']")).click();
//	    action.perform();
	    
//		login.EnterId("OKP335");
//		login.EnterPassword("QAZ123456");
//		login.Enterlogin(); 
//		ZerodhaPinPage pinpage=new ZerodhaPinPage(driver);
//		pinpage.pincode("456789");
//		pinpage.Coutinue();
	
     }
 }
	
	

	@Test
	 public void ForgotpassTest() throws InterruptedException {
		 ZerodhaLoginPage pinpage=new ZerodhaLoginPage(driver);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 pinpage.Enterforgot();
		 
		 Set<String> set=driver.getWindowHandles();
		 java.util.Iterator<String> window = set.iterator();
		 
		 while(window.hasNext()) {
			 String value=window.next();
			 driver.switchTo().window(value);
		 
			 if(driver.getTitle().equals("Forgot password/kite")){
				 driver.findElement(By.linkText("I remember my user ID"));
			 } 
		 ZerodhaForgotPasswordTest forgot=new ZerodhaForgotPasswordTest(driver);
		 forgot.EnterRad();
		 forgot.EnterUserid("Umesh");
		 forgot.EnterPan("ABPC2345");
		 forgot.EnterRadio2();
		 forgot.EnterNumber("9823348292");
		 //forgot.EnterEmail("Umesh@gmail.com");
			 		  
   }	 
}
	 @Test
	 public void signup() throws InterruptedException {
		 ZerodhaLoginPage signup=new ZerodhaLoginPage(driver);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 signup.EnterSignup();
		 
		 Set<String> set = driver.getWindowHandles();
		 java.util.Iterator<String> window = set.iterator();
		 
		 while(window.hasNext()) {
			 String um=window.next();
			 driver.switchTo().window(um);
			 
			 if(driver.getCurrentUrl().equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account")) {
				driver.findElement(By.xpath("//li[@class='hide-on-small']"));
			 
			 Thread.sleep(1000);
			 ZerodhaSignUpPage sign=new ZerodhaSignUpPage(driver);
			 sign.EnterSignUp();
			 Thread.sleep(1000);
			 sign.EnterNumber("9823348292");
			 Thread.sleep(1000);
			 //sign.EnterContinue();
			//sign.EnterNRI();
			Thread.sleep(1000);
			driver.navigate().back();
			sign.EnterAbout();  Thread.sleep(2000);
			driver.navigate().back();
			sign.EnterProducts();    Thread.sleep(2000); 
			driver.navigate().back();
			sign.EnterPricing();   Thread.sleep(2000);
			driver.navigate().back();
			sign.EnterSupport();   Thread.sleep(2000);
			driver.navigate().back();
			 
			
				
			
			 
		 }
	 }
	 
	
}

	
	
}
