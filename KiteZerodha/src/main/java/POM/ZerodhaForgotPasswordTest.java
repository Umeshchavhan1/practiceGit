package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPasswordTest {
	@FindBy(xpath="//label[@for='radio-30']")private WebElement rad;
	//@FindBy(xpath="//label[@for='radio-31']")private WebElement radio1;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement userid;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement pan;
	@FindBy(xpath="//label[@for='radio-36']")private WebElement radio2;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement number;
	//@FindBy(xpath="(//input[@type='text'])[2]")private WebElement email;
	@FindBy(xpath="")private WebElement Reset;
	
	public ZerodhaForgotPasswordTest(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void EnterRad() {
		rad.click();
	}
//	public void EnterRadio1() {
//		radio1.click();
//	}
	public void EnterUserid(String UserID) {
		userid.sendKeys(UserID);
	}
	public void EnterPan(String Pan) {
		pan.sendKeys(Pan);
	}
	public void EnterRadio2() {
		radio2.click();
	}
	public void EnterNumber(String num) {
		number.sendKeys(num);
	}
	
//	public void EnterEmail(String Email) {
//		email.sendKeys(Email);
//	}
	public void EnterReset() {
		Reset.click();
	}
	
}
