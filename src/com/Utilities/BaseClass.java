package com.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class BaseClass {
	
	public WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebDriver browserLaunch(String browser) {
		
		
		if(browser.equalsIgnoreCase("Google Chrome") || (browser.equalsIgnoreCase("Chrome"))) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UD20461958\\Selenium\\Locators\\SeleniumWebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("Microsoft Edge") || (browser.equalsIgnoreCase("edge"))) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\UD20461958\\Selenium\\Locators\\SeleniumWebDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		} else {
			System.out.println("Sorry!!!! -- Browser Not Supported");
		}
		return driver;
		
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();

	}
	
	public String titleVerify(String expectedtit) {

		String expectedTitle = expectedtit;
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		return actualTitle;


	}

}
