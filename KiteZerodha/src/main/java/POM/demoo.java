package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoo {
	 
	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//input[@name='name']")private WebElement name ;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
	@FindBy(xpath="//input[@name='age']")private WebElement age;
	@FindBy(xpath="//input[@type='checkbox']")private WebElement radio;
	@FindBy(xpath="//input[@name='city']")private WebElement city;
	@FindBy(xpath="//input[@name='State']")private WebElement state;
	@FindBy(xpath="//input[@name='pin']")private WebElement pin;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")private WebElement radiojava;
	@FindBy(xpath="(//input[@type='checkbox'])[3]")private WebElement radiosft;
	@FindBy(xpath="(//input[@type='checkbox'])[7]")private WebElement tv;
	
	public void demoo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void EnterEmail(String ID) {
		email.sendKeys(ID);
	}
	public void EnterName(String Name) {
		name.sendKeys(Name);
	}
	public void EnterLastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}
	public void EnterAge(String Age) {
		age.sendKeys(Age);
	}
	public void EnterRadio() {
		radio.click();
	}
	public void EnterCity(String City) {
		city.sendKeys(City);
	}
	public void EnterState(String State) {
		state.sendKeys(State);
	}
	public void EnterPin(String Pin) {
		pin.sendKeys(Pin);
	}
	public void EnterRJ() {
		radiojava.click();
	}
	public void EnterSoft() {
		radiosft.click();;
	}
	public void EnterTV() {
		tv.click();;
	}
	

}
