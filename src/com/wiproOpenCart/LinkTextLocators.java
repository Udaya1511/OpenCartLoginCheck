package com.wiproOpenCart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class LinkTextLocators {
	
	public WebDriver driver;
	public BaseClass bc;
	int Total = 0;
	
	@Test
	public void LinksLoators() {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		
		List<WebElement> Links = driver.findElements(By.xpath("//li"));
		int linkCounts = Links.size();
		Total = Total+Links.size();
		System.out.println(linkCounts);
		
		for (int i = 1; i < Links.size(); i++) {
			System.out.println(Links.get(i).getText());
		}
		

	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

}
