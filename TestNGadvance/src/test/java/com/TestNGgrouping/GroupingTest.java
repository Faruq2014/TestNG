package com.TestNGgrouping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test(groups={"Login"})

public class GroupingTest {
	@Test(groups={"smoke"})
	public void loginTest() {
	      System.out.println("SMOKE TEST"); 
	       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.cssSelector("input[id=email]")).sendKeys("aaaa");
	         driver.findElement(By.cssSelector("#pass")).sendKeys("abcd1234");
	        
	    //  driver.findElement(By.cssSelector("input[id^=u_0]")).click();
	      // System.out.println( driver.findElement(By.cssSelector(".fsl")).getText());
	       driver.quit();
     }
	
	@Test(groups={"functional"})
	public void forgetLinkTest() {
		 System.out.println("functional TEST"); 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Forgot")).click();
        System.out.println("the forgotpage title is "+" "+driver.getTitle());
        String expectedTitle = "Forgot Password | Can't Log In | Facebook";
      // Assert.assertEquals(actualTitle, expectedTitle);
        driver.quit();
 
	}
	@Test(groups={"Regression"})
	public void birthDayTest() {
		System.out.println("Regression TEST"); 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        WebElement element1 = driver.findElement(By.id("month"));

        WebElement element2 = driver.findElement(By.id("day"));

        WebElement element3 = driver.findElement(By.id("year"));
        
       Select month = new Select(element1);
       Select day = new Select(element2);
       Select year = new Select(element3);
        
       month.selectByVisibleText("Jan");
	    day.selectByIndex(24);
	    year.selectByValue("2018");
	    
	
		driver.quit();
		
	
 
	
		
	}
}
