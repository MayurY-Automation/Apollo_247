package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import utils.SetupDriver;

public class Medicines_page {
	
	/**
	 * @author Mayur
	 * @Description Pageobject for Medicine_&_Pharmacy_Page
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

//****************************************Medicine_&_Pharmacy_Page_WebElements****************************************************************
   
    By medicines = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[2]/div");
	By medicine_searchbox = By.xpath("//*[@id=\"searchProduct\"]");
	By glucon_d = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div/div/div/div[1]/div/div/div[1]/a/p");
	By open_product = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[4]/div/div/div/div[1]/div/div/div[1]/a");
	By medicine_add_to_cart = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div[1]/div[2]/button");
	By medicine_go_to_cart = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[2]/div[2]/span[1]");
	By medicine_review_order = By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/button");
	By medicine_proceed_to_pay = By.xpath("//button[@title=\"Proceed to pay bill\"]");

//*****************************************************************************************************************************

	WebDriver driver = SetupDriver.getBrowserName();
	
	//Excel
			FileInputStream FRead;

			FileOutputStream FWrite;
			
			XSSFWorkbook wb;

			XSSFSheet sh;

			String d1, d2,d3;
	
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
		//driver.findElement(mobile_number).sendKeys("8424022673");
		driver.findElement(go_to_otp).click();
	    System.out.println("User entered mobile number");
		String s1 = driver.findElement(valid_no_msg).getText();
		System.out.println(s1);
		//FWrite=new FileOutputStream("C:\\Apollo247\\apollo24.xlsx");
		//sh.getRow(1).getCell(2).setCellValue(s1);	
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
	
	//Scenario 1://	
	
	public void medicines_and_essentials() {
		driver.findElement(medicines).click();
		System.out.println("User is on medicines page");
	}
	
	public void search_medicines_and_more() throws Exception {
		Thread.sleep(5000);
		driver.findElement(medicine_searchbox).click();
		FRead=new FileInputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		wb=new XSSFWorkbook(FRead);
		sh= wb.getSheet("Lab_and_medicine");
		d1=sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println("User clicked on Search medicines and more");
		driver.findElement(medicine_searchbox).sendKeys("Glucon D");
		//driver.findElement(medicine_searchbox).sendKeys("Glucon D");
		System.out.println("User searched for Glucon D");
		Thread.sleep(3000);
		Actions A1 = new Actions(driver);
		A1.moveToElement(driver.findElement(medicine_searchbox)).click().sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		String s1 = driver.findElement(glucon_d).getText();
		System.out.println(s1);
		System.out.println("User selcted suggestion for searched product");
		driver.findElement(open_product).click();
		Thread.sleep(2000);	
		System.out.println("User opened the product details");
	}

	public void add_to_cart() throws Exception {
		Thread.sleep(2000);
		try {
			//driver.findElement(medicine_add_to_cart).click();
			Thread.sleep(2000);
			driver.findElement(medicine_go_to_cart).click();
			System.out.println("User added the product to the cart");
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}

	public void review_order() throws Exception {
		driver.findElement(medicine_review_order).click();
		Thread.sleep(2000);
		System.out.println("User clicked on review order");
	}

	public void proceed_to_pay() throws Exception {
		driver.findElement(medicine_proceed_to_pay).click();
		Thread.sleep(2000);
		System.out.println("User clicked on proceed to pay");
	}

	public void close_browser() {
	    driver.close();
	    System.out.println("Browser closed");
	}


}
