package testngExplanation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {

	static WebDriver driver;
	public void openBrowser(String browser){
		if(browser.equalsIgnoreCase("filefox")){
    System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("internet")){
			System.setProperty("webdriver.chrome.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		
	}
	
	
}
	

