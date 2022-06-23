package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement userid; 
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@href='/forgot']")private WebElement forgot;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement signup;
	
	@FindBy(xpath="//a[@class='orders-nav-item']")private WebElement order;
	@FindBy(xpath="//a[@href='/orders/gtt']")private WebElement gtt;
	@FindBy(xpath="//button[@class='create-new button button-small button-blue']")private WebElement newgtt;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement creategtt;
	
	
	public ZerodhaLoginPage(WebDriver driver) {         //constroctor
		PageFactory.initElements(driver,this);     //
	}
	public void EnterId(String Id) {
		userid.sendKeys(Id);
	}
	public void EnterPassword(String Pass) {
		password.sendKeys(Pass);
	}
	public void Enterlogin() {
		login.click();
	}
	public void Enterforgot() {
		forgot.click();
	}
	public void EnterSignup() {
		signup.click();
	}
	
	public void Enterorder() {
		order.click();
	}
	public void EnterGtt() {
		gtt.click();
	}
	public void EnterNewGtt() {
		newgtt.click();
	}
	public void EnterCreateGtt() {
		creategtt.click();	
	}
	public void 


	
	

}
