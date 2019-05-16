package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Function {

	
	//driver.findelement is where all the projection go
	public WebDriver driver;
	
	public void typexpath(String Locator, String Value){
		//classname locators/classname values
		driver.findElement (By.xpath(Locator)).sendKeys(Value);
	}
	
	public void clickbyxpath(String Locator){
		driver.findElement(By.xpath(Locator)).click();
	}
	
		
	
	
	
	
}
