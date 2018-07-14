package testngExplanation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BandA {
	
	@BeforeMethod
	public void setp(){ 
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    WebDriver   driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("starting method");
	}
	@AfterMethod
	public void quit(){
		WebDriver   driver = new FirefoxDriver();
		driver.quit();
	}
	@Test
	
public void login(){
	  //System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
      WebDriver   driver = new FirefoxDriver();

       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("https://www.facebook.com/");
       driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
       driver.findElement(By.id("pass")).sendKeys("abcd1234");
       driver.findElement(By.cssSelector("input[id^=u_0]")).click();

	
}

}
