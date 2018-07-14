package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Parameterization {
	

    
	
	@Test(dataProvider="getData")
	public void dologinTest(String username, //Argument for parameter
			String password, 
			String expected,
			String browser,
			int phone){
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			       WebDriver   driver = new FirefoxDriver();
			 
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			        driver.get("https://www.facebook.com/");
			        
			        driver.findElement(By.cssSelector("#email")).sendKeys(username);
			         driver.findElement(By.cssSelector("#pass")).sendKeys(password);
			        driver.findElement(By.cssSelector("input[id^=u_0]")).click();
			       System.out.println( driver.findElement(By.cssSelector(".fsl")).getText());
		     

	                System.out.println(username+" "+ password);	
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
		
		Object [][] data = new Object[4][5];
		// creating two dimensional array for data set. 
		data [0][0]="u1"; 
		data [0][1]="p1";
		data [0][2]="pass";
		data [0][3]="Mozilla";
		data [0][4]=343286988;
		
		data [1][0]="u2";
		data [1][1]="p2";
		data [1][2]="pass";
		data [1][3]="Mozilla";
		data [1][4]=789286988;
		
		
		data [2][0]="u3";
		data [2][1]="p3";
		data [2][2]="pass";
		data [2][3]="Mozilla";
		data [2][4]=678286988;
		
		
		data [3][0]="u4";
		data [3][1]="p4";
		data [3][2]="pass";
		data [3][3]="Mozilla";
		data [3][4]=456286988;
		
		
		return data;
	}

}
