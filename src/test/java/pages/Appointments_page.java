package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice.This;
import utils.SetupDriver;

public class Appointments_page {
	
	/**
	 * @author Shubham
	 * @Description Pageobject for Appointment_Page
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
	
//****************************************Appointment_Page_WebElements****************************************************************

	By book_video_consulting = By.xpath("//*[@id=\\\"__next\\\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/button/span[1]");
	By popular_city = By.xpath("//*[@id=\\\"mainContainerCT\\\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[3]/div/ul/li");
	By appointment_search_box = By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input");
	By dermatology_list_element = By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[1]/div[2]/div[2]/div[3]/div/div[3]/div[2]/div[1]/ul/a[1]/li");
	By best_dr_in_hyd = By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[1]/div[2]/div[2]/div[2]/h1");
	By video_consulting = By.xpath("//*[@id=\\\"mainContainerCT\\\"]/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/div/div/div/button/span[1]");
	By hospital_consulting = By.xpath("//*[@id=\"mainContainerCT\"]/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[2]/div/div/div[2]/button");

//*********************************************************************************************************************************

	WebDriver driver = SetupDriver.getBrowserName();
	
	//Excel
	
			FileInputStream FRead;

			FileOutputStream FWrite;
			
			XSSFWorkbook wb;

			XSSFSheet sh;

			String d1, d2,d3;
	
//Background
			
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
		} catch (Exception e) {
			System.out.println("popup not displayed");
		}
		System.out.println("User is on homepage");
	}

	public void click_on_Book_appointment_with_doctor() {
		driver.findElement(appointment).click();
		System.out.println("User is on appointment page");
	}

//Scenario 1:

	public Appointments_page(WebDriver driver2) {
		this.driver = driver2;
	}

	public Appointments_page() {
		// TODO Auto-generated constructor stub
	}

	public void Enter_the_Data_in_Search_bar() throws InterruptedException {
		System.out.println("searched");
	}

	public void Verifies_whether_it_displays_appropriate_Doctors_or_Specailties_or_not(String ExpectedPage)
			throws InterruptedException {
		try {
			Thread.sleep(3000);
			Assert.assertTrue(driver.getCurrentUrl().contains(ExpectedPage));
		} catch (AssertionError e) {
			System.out.println(e);
		}
		System.out.println("User verified doctors");
	}

	public void Click_on_the_Book_Video_Consult() {
		try {
			Actions Act = new Actions(driver);
			Act.moveToElement(driver.findElement(book_video_consulting));
			Thread.sleep(2000);
			driver.findElement(book_video_consulting).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("User click on Book video consultant");
	}

	// Scenario 2:

	public void Click_on_the_Popular_city(String string) {
		try {
			List<WebElement> Cities = driver.findElements(By.xpath(
					"//*[@id=\"mainContainerCT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[3]/div/ul/li"));
			for (WebElement City : Cities) {
				String Str = City.getText();
				if (Str.equalsIgnoreCase(string)) {
					City.click();
					break;

				}
				Thread.sleep(5000);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("User selected popular city from list");
	}

	public void Verifies_whether_it_displays_appropriate_city_or_not(String ExpectedPage) throws InterruptedException {
		try {
			Thread.sleep(2000);
			Assert.assertEquals(driver.getCurrentUrl(), ExpectedPage);
			Thread.sleep(1000);
		} catch (AssertionError e) {
			System.out.println(e);
		}
		System.out.println("User verified city");
	}

	// Scenario 3:

	public void Enters_the_data_in_Search_bar(String string) {
		try {

			driver.findElement(appointment_search_box).sendKeys(string);
			Thread.sleep(4000);

			driver.findElement(dermatology_list_element).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("User searched in search box");
	}

	public void Verifies_whether_it_displays_appropriate_Specailties_or_not(String ExpectedData)
			throws InterruptedException {
		try {
			
			Thread.sleep(4000);
			String ActualResult = driver.findElement(best_dr_in_hyd).getText();
			Assert.assertTrue(ActualResult.contains(ExpectedData));
		} 
		catch (AssertionError e) {
			
			System.out.println(e);
		}
		System.out.println("User verified specialities");
	}
	
	// Scenario 4:

	public void Click_on_book_Video_consult() {
		try {
			Actions Act = new Actions(driver);
			Act.moveToElement(driver.findElement(video_consulting));
			Thread.sleep(4000);
			driver.findElement(video_consulting).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("User selected video consulting");
	}

	// Scenario 5:

	public void Click_on_Book_Hospital_visit() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(hospital_consulting).click();
		System.out.println("User selected hospital visit");
	}
	public void close_browser() {
		   driver.close();
		   System.out.println("Browser closed");
	}

}
