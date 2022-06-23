package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaFindTest {
	
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="//span[@class='symbol']")private WebElement list;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement buy;
	//@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancel;
	//@FindBy(xpath="(//button[@class='button-orange'])[1]")private WebElement sell;
	@FindBy(xpath="(//label[@class='su-radio-label'])[9]")private WebElement market;
	@FindBy(xpath="(//label[@class='su-radio-label'])[10]")private WebElement limit;
	@FindBy(xpath="(//label[@class='su-radio-label'])[11]")private WebElement slim;
	@FindBy(xpath="(//label[@class='su-radio-label'])[12]")private WebElement slmarket;


			//li[@class='search-result-item selected isadded']

	public ZerodhaFindTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Search(String Search) {
		search.sendKeys(Search);
	}
	public void EnterList() {
		list.click();
	}
	public void EnterBuy() {
		buy.click();
	}
//	public void EnterCancel() {
//		cancel.click();
//	}
//	public void EnterSell() {
//		sell.click();
//	}
	public void ClickOnMarketRadio() {
		market.click();
	}
	public void ClickOnLimitRadio() {
		limit.click();
	}
	public void ClickOnSLRadio() {
		slim.click();
	}
	public void ClickOnSLMRadio() {
		slmarket.click();
	}

	

}
