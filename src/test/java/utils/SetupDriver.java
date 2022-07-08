package utils;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import configurations.BrowserInit;

public class SetupDriver {
	public static WebDriver driver;
	public static final BrowserInit browserInit=new BrowserInit();
	public static WebDriver getBrowserName()
	{
	 String browser=browserInit.getBrowserName();
	 switch (browser) {
	case "chrome":
		return chromeDriver();
	case "edge":
		return edgeDriver();

	default:
		 System.out.println("Invalid browser" + browser);
		 return null;
	}

}
	public static WebDriver chromeDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MYADAV16\\Desktop\\Agile\\SPrint 2\\Apollo247\\src\\test\\resources\\drivers\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//driver = new ChromeDriver(options);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public static WebDriver edgeDriver()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\MYADAV16\\Desktop\\Agile\\SPrint 2\\Apollo247\\src\\test\\resources\\drivers\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		// options.addArguments("--disable-notifications");
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
  public static void teardown() {
		
		driver.close();
        driver.quit();
		
	}

	
	}