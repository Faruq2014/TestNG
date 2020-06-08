package com.TestNGListenersResult;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ITestResult {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void login1Test() {
		
		driver.findElement(By.id("email")).sendKeys("m@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("faruq");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		//WebDriverWait wait = new WebDriverWait(driver, 8);
		//wait.until(ExpectedConditions.titleContains("Log into Facebook | Facebook:"));
	//	Assert.assertEquals(driver.getTitle(), "faruq Molla");
		driver.quit();
	}
	
	@Test(priority = 2)
	public void login2Test() {
		
		driver.findElement(By.id("email")).sendKeys("m@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("faruq");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		//WebDriverWait wait = new WebDriverWait(driver, 8);
		//wait.until(ExpectedConditions.titleContains("Log into Facebook | Facebook:"));
		Assert.assertEquals(driver.getTitle(), "faruq Molla");
		driver.quit();
	}
	
	@AfterMethod
	public static  void getptatus(org.testng.ITestResult result) {
	System.out.println("Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
	}
	

		
}
