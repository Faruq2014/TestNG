package testngExplanation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnableTrueFalse {
	

	public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe";
    public WebDriver driver; 
   
    
    
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver= new FirefoxDriver();
        driver.get(baseUrl);
    }

	@AfterTest
	public void aftertest(){
		
		 driver.quit();
		System.out.println("finished executing the test");
		
	}

@BeforeMethod
public void verifyHomepageTitle() {
System.out.println("start executing method");
}
@AfterMethod
public void goBackToHomepage ( ) {
System.out.println("finish executing method");
 
driver.navigate().back();

}
    
    
	

@Test(priority=1)

public void login(){
	
      
       driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
       driver.findElement(By.id("pass")).sendKeys("abcd1234");
       driver.findElement(By.cssSelector("input[id^=u_0]")).click();
       
}	

@Test(enabled=false)
public void forgot(){
 driver.findElement(By.partialLinkText("Forgot")).click();
 }

@Test(enabled=false )
public void postComment(){
 driver.findElement(By.partialLinkText("Forgot")).click();
 }

@Test( )
public void clickLike(){
 driver.findElement(By.partialLinkText("Forgot")).click();
 }

@Test(enabled=true)
public void openMainPage(){
 driver.get("https://www.gmail.com/");
 System.out.println("gmai is for email");
 }



}
