package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.SearchLocator;
import values.SearchValues;



public class TestSearch extends Config {
		
	SearchLocator SL = new SearchLocator();
	SearchValues SV = new SearchValues();
	
		
	@Test
	
	public void TestSearchOption() {
		
	
	driver.findElement(By.xpath(SL.SearchLocator)).sendKeys(SV.SearchValue);
		
	}		
	
	
	
	
	
	
}
