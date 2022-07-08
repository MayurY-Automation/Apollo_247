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

public class Lab_tests_page {
	
	/**
	 * @author Omkar
	 * @Description Pageobject for Lab_Tests_Page
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
    By appointment = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[1]/div/a");

//****************************************Lab_Tests_Page_WebElements****************************************************************
    
	By Book_Lab_Tests_button = By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div[1]/div[2]/div/div[3]/div/a/div[2]/h3");
	By Search_lab_test = By.xpath("//*[@id=\"fixedSearchCT\"]/div[1]/div/div/input");
	By Selects_test_from_suggestions = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/div/div[2]/ul/li[1]/div/a/div/div[1]/span");
	By Add_test_to_cart = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/div/div[2]/ul/li[1]/div/div/div[2]/div/button/span[1]");
	By go_to_cart_button = By.xpath("//*[@id=\"__next\"]/div/div[5]/div[2]/div[2]/button");
	By User_selects_patient_name = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]");
	By Select_tests_page = By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/button/span[1]");
	By Select_view_all = By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/div[3]/div[1]/div[1]/div/div[1]/div/div/div[1]/button/span[1]");
	By Select_the_address = By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div/div[1]/div/div/div/ul/li[1]/label/span[2]");
	By Click_on_done_button = By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/button/span[1]");
	By Updated_price = By.xpath("/html/body/div[8]/div[3]/div/div/div[2]/div/button/span[1]");
	By Select_slot_for_the_appointment = By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/div[4]/div[1]/div[1]/div/div[2]/div/div/div[1]/button");
	By Click_on_done_to_book_slot = By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[4]/button");

//********************************************************************************************************************************
	
	WebDriver driver = SetupDriver.getBrowserName();
	
	//Excel
			FileInputStream FRead;

			FileOutputStream FWrite;
			
			XSSFWorkbook wb;

			XSSFSheet sh;

			String d1, d2,d3;
			
	//Background://		
	
	public void user_is_on_Home_Page() {
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
		} 
		catch (Exception e) {
			System.out.println("popup not displayed");
		}
		
		System.out.println("User is on homepage");
	}


	public void Book_Lab_Tests_button() {
		driver.findElement(Book_Lab_Tests_button).click();
		System.out.println("User clicked on Book lab test");

	}

	//Scenario 1://
	
	public void Enter_the_test_name_in_Search_bar_and_press_enter() throws Exception {
		FRead=new FileInputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		wb=new XSSFWorkbook(FRead);
		sh= wb.getSheet("Lab_and_medicine");
		d1=sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(Search_lab_test).click();
		driver.findElement(Search_lab_test).sendKeys(d1);
		//driver.findElement(Search_lab_test).sendKeys("Blood Test");
		Thread.sleep(3000);
		Actions A1 = new Actions(driver);
		A1.moveToElement(driver.findElement(Search_lab_test)).click().sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		String s1 = driver.findElement(Selects_test_from_suggestions).getText();
		System.out.println(s1);
		System.out.println("User searched for the lab test and got suggestion");

	}

	
	public void select_the_required_test_from_suggestions() throws Exception {
		Thread.sleep(3000);

		driver.findElement(Selects_test_from_suggestions).click();
		System.out.println("User selected test from suggestion");
	}

	
	public void add_the_selected_test_to_cart() throws Exception {
		driver.findElement(Add_test_to_cart).click();
		Thread.sleep(3000);
		System.out.println("User added selected test to cart");

	}

	
	public void go_to_cart_button() throws Exception {

		driver.findElement(go_to_cart_button).click();
		Thread.sleep(3000);
		System.out.println("User clicked on go to cart button");

	}


	
	public void selects_patient_name() throws Exception {

		driver.findElement(User_selects_patient_name).click();
		Thread.sleep(3000);
		System.out.println("User selected patient name");
	}

	
	public void select_tests_page() throws Exception {

		driver.findElement(Select_tests_page).click();
		Thread.sleep(2000);
	}

	
	public void selects_the_address() throws Exception {

		driver.findElement(Select_view_all).click();
		Thread.sleep(2000);

		driver.findElement(Select_the_address).click();
		Thread.sleep(3000);

		driver.findElement(Click_on_done_button).click();
		Thread.sleep(2000);

		driver.findElement(Updated_price).click();
		Thread.sleep(2000);
		System.out.println("User selected address");
	}

	
	public void selects_slot_for_the_appointment() throws Exception {

		driver.findElement(Select_slot_for_the_appointment).click();
		Thread.sleep(10000);

		driver.findElement(Click_on_done_to_book_slot).click();
		System.out.println("User selected appointment slot");

	}
	
	public void close_browser() {
	    driver.close();
	    System.out.println("Browser closed");
	}
	
	
}
