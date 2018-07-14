package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngExplanation.FaceBook;

public class BeforeAfterMethod {
	
	@Test
	public void testone(){
		FaceBook fb = new FaceBook();
		fb.login();
		fb.forgot();
		fb.link();
		
	}
	
	
	@BeforeTest
	public void beforetest(){
		System.out.println("stating executing the test");
	}
	@AfterTest
	public void aftertest(){
		System.out.println("finished executing the test");
	}
	@BeforeMethod
	
	public void beforemethod(){
		System.out.println("stating executing the method");
	}
	@AfterMethod
	
	public void aftermethod(){
		 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      WebDriver   driver = new FirefoxDriver();
	      driver.close();
		System.out.println("finished executing method");
	}
}
