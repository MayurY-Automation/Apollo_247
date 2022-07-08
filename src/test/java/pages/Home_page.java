package pages;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SetupDriver;

public class Home_page {
	
	/**
	 * @author Gandhar
	 * @Description Pageobject for Home_Page
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
	By valid_no_msg = By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]");
	
//****************************************Home_Page_WebElements****************************************************************
	
	By home_button = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[1]/a/img");
	By appointment = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[1]/div/a");
	By health_records = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[4]/div/a");
	By health_records_home_button = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header/div[1]/a");
	By medicines = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[2]/div/a");
	By lab_test = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[3]/div/a");
	By lab_test_home_button = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[1]/a");
	By circle = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[4]/ul/li[5]/a");
	By circle_home_button = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header/div[1]/a");
	By cart = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[4]/div[1]/span");
	By cart_home_button = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/header/div[1]/a");
	
//*****************************************************************************************************************************
	
WebDriver driver = SetupDriver.getBrowserName();
	
	//Excel

	FileInputStream FRead;

	FileOutputStream FWrite;

	XSSFWorkbook wb;

	XSSFSheet sh;

	String d1, d2, d3;
			
    //Background://
	
	public void user_is_on_HomePage() {
		driver.get("https://www.apollo247.com/");
		driver.findElement(later).click();
		System.out.println("User is on Webpage");
	}

	public void user_Navigate_to_LogIn_Page() {
		driver.findElement(login).click();
		System.out.println("User is on login page");  
	}
	
	public void user_enters_Mobile_Number_and_OTP() throws Exception {
		FRead=new FileInputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		wb=new XSSFWorkbook(FRead);
		sh= wb.getSheet("login");
		d1=sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(mobile_number).sendKeys(d1);
		// driver.findElement(mobile_number).sendKeys("8424022673");
		driver.findElement(go_to_otp).click();
		System.out.println("User entered mobile number");
		String s1 = driver.findElement(valid_no_msg).getText();
		System.out.println(s1);
		// FWrite=new FileOutputStream("C:\\Apollo247\\apollo24.xlsx");
		// sh.getRow(1).getCell(2).setCellValue(s1);
		System.out.println("Enter OTP");
		Scanner sc = new Scanner(System.in);
		String s2 = sc.next();
		driver.findElement(otp).sendKeys(s2);
		System.out.println("User entered OTP");
	}
	
	public void message_displayed_Login_Successfully() throws InterruptedException {
		driver.findElement(validate_otp).click();
		Thread.sleep(2000);
		System.out.println("User logged in successfully");
		try {
			System.out.println(driver.findElement(welcome).getText());
			// Thread.sleep(45000);
			WebElement x = driver.findElement(frame1);
			driver.switchTo().frame(x);
			driver.findElement(close_pop_up).click();
		} catch (Exception e) {
			System.out.println("popup not displayed");
		}
		System.out.println("User is on homepage");
	}
	
	//Scenario 1: //
	
	public void Book_appointment_with_doctor_button() {
		driver.findElement(appointment).click();
		System.out.println("User is on appointment page");
	}

	public void home_button_on_appointment() {
		driver.findElement(home_button).click();
		System.out.println("User is on home page");
	}
	
	public void Health_records() {
		driver.findElement(health_records).click();
		System.out.println("User is on Health records page");
	
	}

	public void home_button_on_helath_records() {
		try {
			driver.findElement(health_records_home_button).click();
			System.out.println("User is on home page");
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	public void Book_lab_test() {
		driver.findElement(lab_test).click();
		System.out.println("User is on lab test page");
	}

	public void home_button_on_lab_test() {
		driver.findElement(lab_test_home_button).click();
		System.out.println("User is on home page");
	}
	
	public void Circle_button() {
		driver.findElement(circle).click();
		System.out.println("User is on circle page");
	}
	
	public void home_button_on_circle() {
		driver.findElement(circle_home_button).click();
		System.out.println("User is on home page");
	}

	
	public void Cart_button() {
		driver.findElement(cart).click();
		System.out.println("User is on cart page");
	}
	
	public void home_button_on_cart() {
		driver.findElement(cart_home_button).click();
		System.out.println("User is on home page");
	}
	
	public void medicines_and_essentials() {
		driver.findElement(medicines).click();
		System.out.println("User is on medicines page");
	}

	public void close_browser() {
	    driver.close();
	    System.out.println("Browser closed");
	}
	

	
}
