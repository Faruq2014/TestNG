package testngExplanation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel {

	//public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe";
    public static WebDriver driver; 
   

@BeforeSuite(alwaysRun = true)
public void setupSuite() {
	 System.setProperty("webdriver.gecko.driver", driverPath);
     driver= new FirefoxDriver();
    // driver.get("https://www.facebook.com/");
}
@BeforeTest
public void beforeTest(){
	System.out.println("starting test");
}
@AfterTest
public void afterTest(){
	System.out.println("closing  test");	
}
@Test(description="functional test, to check gmail")
public void openGmail(){
	 driver.get("https://www.gmail.com/");
	 
	 
}

@Test(description="functional test, to check log in for Facebook")
public void openFaceBook(){
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
}
@AfterSuite(alwaysRun = true)
public void tearDown() {
driver.close();
}

}
