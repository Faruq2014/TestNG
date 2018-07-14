package testngExplanation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_Dataprovider {

	@Test(dataProvider="getData")
	public void dologinTest(String username,String password ){
		
				System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			       WebDriver   driver = new FirefoxDriver();
			 
			        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			        driver.get("https://www.facebook.com/");
			        
			        driver.findElement(By.cssSelector("#email")).sendKeys(username);
			         driver.findElement(By.cssSelector("#pass")).sendKeys(password);
			        driver.findElement(By.cssSelector("input[id^=u_0]")).click();
			        System.out.println(username+" "+ password);	
			        driver.close();
		     

	               
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("starting method---");
		
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----------------------------");
	}
	@DataProvider // data provider for parameter
	public Object [][] getData(){  //calling method for parameter
		
		Object [][] data = new Object[4][2];
		// creating two dimensional array for data set. 
		data [0][0]="u1"; 
		data [0][1]="p1";
		
		
		data [1][0]="u2";
		data [1][1]="p2";
		
		
		
		data [2][0]="u3";
		data [2][1]="p3";
		
		
		
		data [3][0]="u4";
		data [3][1]="p4";
		
		
		
		return data;
	}

}
