package testngExplanation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenShotUtlity {
public static void screenShot(String imageName, WebDriver driver){
	TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
File files	=takeScreenshot.getScreenshotAs(OutputType.FILE);

//FileUtils.copyFile(file, new file("c:\\"+imageName+".jpj"));	
}
}
