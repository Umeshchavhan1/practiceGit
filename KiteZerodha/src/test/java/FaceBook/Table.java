package FaceBook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Driver1;

public class Table {
	
	public static void main(String[] args) {
		
		WebDriver driver=Driver1.openbrowser();
	    driver.manage().window().maximize();
	    
	    List<WebElement> columns= driver.findElements(By.xpath("//table//thead//tr//th"));
	    int columnsize=columns.size();
	    System.out.println(columnsize);
	    
	    List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
	    int rowsSize=rows.size();
	    System.out.println(rowsSize);
	    
	    List<WebElement> currentprice=driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
	    
	    for(int i = 0;i<currentprice.size();i++)
	    {
	    	WebElement price = currentprice.get(i);
	    	String currentvalue=price.getText();
	    	System.out.println(currentvalue);
	    }
	  
	}

}
