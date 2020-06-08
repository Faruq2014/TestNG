package com.TestNGParallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelThreadTesting {
	
	public static WebDriver driver;
	
	@Test
	public void test1() throws Exception {
	System.out.println(" test one thread number : "+Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.salesforce.com/");
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println(" test two thread number : "+Thread.currentThread().getId());
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
