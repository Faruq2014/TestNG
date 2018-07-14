package testngExplanation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * @BeforeTest and @AfterTest
In @BeforTest method, you can set your firefox profile 
preferences and in @AfterTest method, you can put some 
code which will generate the test result 
and mail it to the stake holders
 */

public class BeforeAfterTest {
	
	 String driverPath = "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	    public WebDriver driver;
	    String baseUrl = "www.gmail.com";
	    
	@BeforeTest (description="set your firefox profile preferences according to your project requirement")

	public void single_run(){
		System.setProperty("webdriver.gecko.driver", driverPath);
	     driver= new FirefoxDriver();
	FirefoxProfile firefoxProfile = new FirefoxProfile();
	firefoxProfile.setPreference ("browser.download.folderList",2);
	firefoxProfile.setPreference ("browser.download.manager.showWhenStarting",false);
	firefoxProfile.setPreference ("browser.download.dir","E:\\reports\\");
	firefoxProfile.setPreference ("browser.helperApps.neverAsk.saveToDisk","csv");
	driver = new FirefoxDriver();
	
	driver.get(baseUrl);
	}

	@AfterTest (description="")
	public void teardown(){
	//a code which will send the test details report
	}

}
