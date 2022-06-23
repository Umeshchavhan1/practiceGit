package FaceBook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Driver1;

public class Tablehigh {
	
	public static void main(String[] args) {
		
		WebDriver driver=Driver1.openbrowser();
		driver.manage().window().maximize();
		
//		WebElement stock=driver.findElement(By.xpath("//table//tbody//tr//td"));
//		String name=stock.getText();
//		System.out.println(name);
		
		List<WebElement> column=driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		
		double min=100000;
		
		for(int i=0;i<column.size();i++)
		{
			WebElement price = column.get(i);
	    	String currentvalue=price.getText();
	    	double value=Double.parseDouble(currentvalue);
	    	
	    	if(value<min)
	    	{
	           min=value;
	    	}
	    }
		System.out.println(min);
			
	}

}
