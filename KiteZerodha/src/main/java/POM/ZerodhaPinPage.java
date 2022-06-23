package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement okk;
	@FindBy(xpath="//a[@href='/forgot']")private WebElement forgotF2A;
    @FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement signup; 
	
	
	public ZerodhaPinPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
	public void EnterPin(String Pin) {
		pin.sendKeys(Pin);
	}
	public void EnterCoutinue() {
		okk.click();
	}
	public void EnterForgotPin() {
		forgotF2A.click();
	}
	public void EnterSignupPin() {
		signup.click();
	}
	
}
	
