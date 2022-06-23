package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	
	@FindBy(xpath="//li[@class='hide-on-small']")private WebElement signup;
	@FindBy(xpath="//input[@type='text']")private WebElement number;
	//@FindBy(xpath="//button[@type='submit']")private WebElement next;
	//@FindBy(xpath="//a[@href='/open-account/nri']")private WebElement NRI;
	@FindBy(xpath="(//a[@class='nav-links'])[1]")private WebElement About;
	@FindBy(xpath="(//a[@class='nav-links'])[2]")private WebElement products;
	@FindBy(xpath="(//a[@class='nav-links'])[3]")private WebElement pricing;
	@FindBy(xpath="(//a[@href='https://support.zerodha.com'])[1]")private WebElement support;
	
	
	
	public ZerodhaSignUpPage(WebDriver driver) {       
		PageFactory.initElements(driver,this);
	}
	public void EnterSignUp() {
		signup.click();
	}

	public void EnterNumber(String NUM) {
		number.sendKeys(NUM);
	}
//	public void EnterContinue() {
//		next.click();
//	}
//	public void EnterNRI() {
//		NRI.click();
//	}
	public void EnterAbout() {
		About.click();
	}
	public void EnterProducts() {
		products.click();
	}
	public void EnterPricing() {
		pricing.click();
	}
	public void EnterSupport() {
		support.click();
	}
	
	

}
