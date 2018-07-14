package testngExplanation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	
public void login(){
	  System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
      WebDriver   driver = new FirefoxDriver();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("https://www.facebook.com/");
       driver.findElement(By.id("email")).sendKeys("molla@yahoo.com");
       driver.findElement(By.id("pass")).sendKeys("abcd1234");
       driver.findElement(By.cssSelector("input[id^=u_0]")).click();

	
}
public void forgot(){
	 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
     WebDriver   driver = new FirefoxDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://www.facebook.com/");
      driver.findElement(By.partialLinkText("Forgot")).click();
      //full link is = Forgot account?
}
public void link (){
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    WebDriver   driver = new FirefoxDriver();

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.navigate().to("https://www.facebook.com/");
    // driver.findElement(By.cssSelector("#privacy-link")).click();
     
    // driver.findElement(By.cssSelector("a[id=privacy-link]")).click();
     //two lines are same with id
    //driver.findElement(By.cssSelector("a[id=terms-link]")).click();
     // anchor link working with regular syntax because they are regular link with attribute value.
  
     //anchor link working with child nth because they are child link
     driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2)")).click();
     driver.navigate().back();
     
     driver.findElement(By.cssSelector("#reg_pages_msg > a:nth-child(1)")).click();

}

}
