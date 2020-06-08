package com.TestNGListenersResult;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResultWithScreenShot {
	WebDriver driver;
	
	@Test(priority = 1)
	public void loginTest() {
		
	}
	

	@Test(priority = 2)
	public void smokeTest() {

	}

	//@Test(priority = 3)
	public void functionalTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Assert.assertEquals(driver.getTitle(), "faruq Molla");
		SoftAssert sfAssert=new SoftAssert();
		sfAssert.assertEquals(driver.getTitle(), "faruq Molla");
		driver.quit();
	}

	@Test(priority = 4)
	public void regressionalTest() {
		fail("need more work");
	}

	@Test(priority = 5)
	public void sanity() {
		throw new SkipException(" We will build it latter. ");
	}
	
	@Test(priority = 6)
	public void e2eTest() {
		throw new SkipException(" We will build it latter. ");
	}
	
	@AfterMethod
	public void get(ITestResult result) {
		
		if (result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Success= Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
			}
		if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed = Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
			System.out.println(result.getName() + " TEST CASE ERROR IS " + result.getThrowable().getMessage());
		   ResultWithScreenShot.getScreenshot( driver, result.getName());
		/*
		//  screenShot 
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/Screenshot/"+ System.currentTimeMillis()
					+ ".png";
			File destination = new File(path);
			try {
				FileUtils.copyFile(src, destination);
			} catch (IOException e) {
				System.out.println("Capture Failed " + e.getMessage());
			}
			
			//Finish screen shot method
			 * 
			 */
		}
		
		if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("Skipped= Method ststus: "+result.getStatus()+" :Method Name: "+result.getMethod().getMethodName());
			System.out.println(result.getName() + " TEST CASE ERROR IS " + result.getThrowable().getMessage());
			
		}
		
		
	}
	
	public static  String getScreenshot(WebDriver driver, String screenShotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/Screenshot/" + screenShotName + System.currentTimeMillis()
				+ ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;

	}
}
