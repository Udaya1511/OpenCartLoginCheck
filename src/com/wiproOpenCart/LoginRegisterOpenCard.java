package com.wiproOpenCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class LoginRegisterOpenCard{

	public WebDriver driver;
	public BaseClass bc;
	
	


	@Test
	public void TestNameDemo () {

		bc=new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		driver.findElement(By.id("input-email")).sendKeys("udayakumar166@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Udaya@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();

	}

}
