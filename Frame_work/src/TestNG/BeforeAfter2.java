package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter2 {
	

	public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
	
	
	
	
	@Test

public void login(){
      //WebDriver   driver = new FirefoxDriver();
	 // driver.get("https://www.facebook.com/");

      
       driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
       driver.findElement(By.id("pass")).sendKeys("abcd1234");
       driver.findElement(By.cssSelector("input[id^=u_0]")).click();
       
      
       String expectedTitle = "Facebook - Log In or Sign Up";
       String actualTitle = driver.getTitle();
       System.out.println("the hompage title is"+" "+actualTitle );
       Assert.assertEquals(actualTitle, expectedTitle);

		
	
}
@Test	
	
public void forgot(){
	
    // WebDriver   driver = new FirefoxDriver();
     // driver.get("https://www.facebook.com/");
	
      driver.findElement(By.partialLinkText("Forgot")).click();
      System.out.println("the forgotpage title is "+" "+driver.getTitle());
      String expectedTitle = "Forgot Password | Can't Log In | Facebook";
    // Assert.assertEquals(actualTitle, expectedTitle);
     
}
	@Test
public void link (){
	
		//WebDriver   driver = new FirefoxDriver();
		driver.findElement(By.cssSelector("#reg_pages_msg > a:nth-child(1)")).click();
     driver.navigate().back();
     
     
     driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2)")).click();
}
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
	//String expectedTitle = "Facebook - Log In or Sign Up";
    String actualTitle = driver.getTitle();
    System.out.println("the current page title is"+" "+actualTitle);
    //Assert.assertEquals(actualTitle, expectedTitle);
}
@AfterMethod
public void goBackToHomepage ( ) {
	System.out.println("finish executing method");
     // driver.findElement(By.linkText("Home")).click() ;
	driver.navigate().back();
	
}


}
