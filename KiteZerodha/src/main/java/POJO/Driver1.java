package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver1 {
	
	public static WebDriver openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/web-table-element.php/"); //method of webdriver is interface
	return driver;  // called returhttps://kite.zerodha.com/ntype method..
	

	}
}
