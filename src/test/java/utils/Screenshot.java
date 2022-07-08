package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	static WebDriver driver=SetupDriver.getBrowserName();
	public static void screenshot() throws IOException
    {
         
       EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
       File srcImg = edriver.getScreenshotAs(OutputType.FILE);
       
       File destImg = new File("C:\\Users\\SAGORADE\\Pictures\\java_screenshots");
       FileUtils.copyFile(srcImg, destImg);  
    }
	
}

