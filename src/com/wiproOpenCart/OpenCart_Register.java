package com.wiproOpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class OpenCart_Register {
	
	public WebDriver driver;
	public BaseClass bc;
	
	@BeforeTest
	public void browserLaunchs() {
		bc=new BaseClass(driver);

	}
	
	@Test (priority = 0)
	public void Registrations() throws InterruptedException {
		bc=new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.name("firstname")).sendKeys("Udaya");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("input-email")).sendKeys("Udayakumar166@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control' and @name='password']")).sendKeys("Udaya@123");
		Thread.sleep(4000);
		WebElement TandC = driver.findElement(By.xpath("//input[@type='checkbox']"));
		TandC.submit();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}
	
	@Test (priority = 1)
	public void verifyPageTitle() {
		
		bc = new BaseClass(driver);
		String pageTitle = driver.getTitle();
		bc.titleVerify(pageTitle);

	}
	
	@Test (priority = 2)
	public void loginWithValidCred() {
		bc = new BaseClass(driver);
		driver.findElement(By.xpath("//a[text()='Login' and @class='list-group-item']")).click();
		driver.findElement(By.id("input-email")).sendKeys("udayakumar166@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Udaya@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
