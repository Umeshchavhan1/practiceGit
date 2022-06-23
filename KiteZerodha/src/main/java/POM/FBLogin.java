package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin {
	
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@value='1']")private WebElement Login;
	
	public void FbLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void entermail(String emailId) {
		email.sendKeys(emailId);
	}
	public void enterpass(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
	    Login.click();
	}
	

}
