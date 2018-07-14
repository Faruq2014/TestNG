package testngExplanation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Description {
	
	public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe";
    public WebDriver driver; 
    

@BeforeSuite(alwaysRun = true)
public void setupSuite() {
	 System.setProperty("webdriver.gecko.driver", driverPath);
     driver= new FirefoxDriver();
     driver.get(baseUrl);
}
@Test(description="functional test, to check log in for Facebook")
public void openFaceBook(){
	 driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
}
@AfterSuite(alwaysRun = true)
public void tearDown() {
driver.close();
}


}
