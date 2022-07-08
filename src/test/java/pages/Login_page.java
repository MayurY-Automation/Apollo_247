package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import utils.SetupDriver;

public class Login_page {
	
	/**
	 * @author Vinay
	 * @Description Pageobject for Login_Page
	 **/
	
//****************************************Login_Page_WebElements****************************************************************
	
	By later = By.xpath("//*[@id=\"wzrk-cancel\"]");
	By close_pop_up = By.xpath("//*[@id=\\\"hidebanner\\\"]/p/span");
	By login = By.xpath("//*[@id=\"loginPopup\"]/span");
	By mobile_number = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input");
	By go_to_otp = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button/span[1]/span");
	By otp = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[1]/input");
	By validate_otp = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button/span[1]/span");
	By frame1 = By.id("wiz-iframe-intent");
	By welcome = By.xpath("//*[@id=\\\"mainContainerCT\\\"]/div[1]/div/div[1]/div[2]/h1/span");
	By invalid_number = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]");
	By valid_no_msg = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]");
	
//***************************************************************************************************************************
	WebDriver driver = SetupDriver.getBrowserName();

	//Excel
	FileInputStream FRead;

	FileOutputStream FWrite;
	
	XSSFWorkbook wb;

	XSSFSheet sh;

	String d1, d2;
	
	/*
	  public void open_browser()
	 
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	*/
	//Background://
	
	public void launchApp() {
		driver.get("https://www.apollo247.com/");
		driver.findElement(later).click();
		System.out.println("User is on Webpage");
	}
    
	public void profile() {
		driver.findElement(login).click();
		System.out.println("User is on login page");                                     
	}
	
	//Scenario 1://
    
	public void mobileNumber() throws Exception {
		FRead=new FileInputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		wb=new XSSFWorkbook(FRead);
		sh= wb.getSheet("login");
		d1=sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(mobile_number).sendKeys(d1);
		//driver.findElement(mobile_number).sendKeys("8424022673");
		driver.findElement(go_to_otp).click();
		System.out.println("User entered mobile number");
		String s1 = driver.findElement(valid_no_msg).getText();
		System.out.println(s1);
		//FWrite=new FileOutputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		//sh.getRow(1).getCell(2).setCellValue(s1);	
	}
   
	public void manualOtp() throws InterruptedException {
		System.out.println("Enter OTP");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		driver.findElement(otp).sendKeys(s1);
		System.out.println("User entered OTP");

	}
    
	public void clickSubmit() throws InterruptedException {
		driver.findElement(validate_otp).click();
		Thread.sleep(2000);
	}
    
	public void message_displayed() throws InterruptedException {
		try {
			System.out.println(driver.findElement(welcome).getText());
			System.out.println("User logged in successfully");
			// Thread.sleep(45000);
			WebElement x = driver.findElement(frame1);
			driver.switchTo().frame(x);
			driver.findElement(close_pop_up).click();
		} catch (Exception e) {
			System.out.println("popup not displayed");
		}
		System.out.println("User is on homepage");
	
	}
    
	//Scenario 2://
	
	public void invalid_mobile_no() throws IOException {
		System.out.println("Invalid Mobile number");
		FRead=new FileInputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		wb=new XSSFWorkbook(FRead);
		sh= wb.getSheet("login");
		d2=sh.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(mobile_number).sendKeys(d2);
		//driver.findElement(mobile_number).sendKeys("1234567890");
		driver.findElement(go_to_otp).click();
		System.out.println("User has entered invalid number");
	}
   
	public void message_invalid_mobile_no() throws FileNotFoundException  {
		String s1= driver.findElement(invalid_number).getText();
		System.out.println(s1);
		//FWrite=new FileOutputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		//sh.getRow(2).getCell(2).setCellValue(s1);
		System.out.println("This seems like a wrong number message is displaying");
		
	}
   
	//Scenario 3://
	
	public void message_invalid_otp()  {
		System.out.println("Incorrect OTP, 2 attempts left is displaying");	
	}
   
	public void close_browser()  {
		driver.close();
		System.out.println("Browser closed");
	}
	
	

}
