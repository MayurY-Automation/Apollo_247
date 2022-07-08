package pages;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SetupDriver;

public class Health_records_page {
	
	/**
	 * @author Sanket
	 * @Description Pageobject for Health_Records_Page
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
	
//****************************************Health_Records_Page_WebElements****************************************************************
	
	By health_records = By.xpath("//a[@title='View Health Records']");
	By doctor_consultations = By.xpath("//span[@title='View Consult & Rx']");
	By add_prescription = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/div/div/button");
	By add_prescription1 = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div[3]/button");
	By add_page = By.xpath("//img[@src='https://newassets.apollo247.com/images/ic_addpagesnew.svg']");
	By calender = By.xpath("//input[@placeholder='DD MMM, YYYY']");
	By record_name = By.xpath("/html/body/div[5]/div[3]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div/div/input");
	By doctor_name = By.xpath("//input[@placeholder='Enter name of doctor']");
	By upload_prescription = By.xpath("//span[contains(text(),'Upload Prescription')]");
	By upload_prescription_alert_button = By.xpath("//span[contains(text(),'Done')]");
	By upload_prescription_alert_warning = By.xpath("//p[contains(text(),'Please Upload the file')");
	By health_conditions = By.xpath("//span[contains(text(),'Health Conditions')]");
	By add_health_data = By.xpath("//span[contains(text(),'Add Health Conditions')]");
	By add_health_conditions = By.xpath("//span[contains(text(),'Add Health Conditions')]");
	By health_record_date = By.xpath("//input[@placeholder='DD MMM, YYYY']");
	By checkbox = By.xpath("/html/body/div[5]/div[3]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/div/div[1]/label/span[1]/span[1]/input");
	By allergy_name = By.xpath("//input[@placeholder='Enter name of allergy']");
	By not_known = By.xpath("/html/body/div[5]/div[3]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/div/div[4]/div/div/div");
	By mild = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
	By plus_sign = By.xpath("/html/body/div[5]/div[3]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/div/div[4]/div/img");
	By dr_name = By.xpath("/html/body/div[5]/div[3]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[4]/div/div/div/input");
	By end_date = By.xpath("//input[@placeholder='Record End Date']");
	By allergy_reaction = By.xpath("//input[@placeholder='Select']");
	By upload_data = By.xpath("/html/body/div[5]/div[3]/div/div/div/div/div/div[2]/button");
	By warning_button = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/button");
	By warning_message = By.xpath("/html/body/div[6]/div[3]/div/div/div/p");
	
//****************************************************************************************************************************
	
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
		//FWrite=new FileOutputStream("C:\\Apollo247\\Apollo247\\src\\test\\resources\\Excel_data\\apollo24.xlsx");
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
	
   public void click_on_Health_records() {
	   driver.findElement(health_records).click();
		System.out.println("User is on Health records page");
	}


   //Scenario 1: //
   
	public void selects_Doctor_Consultation_tab() {
		driver.findElement(doctor_consultations).click(); 
		System.out.println("doctor_consultations tab selected");
	}

	
	public void past_consultation_prescription_data() {
		System.out.println("Previous data is not available");
	}

	
	public void Add_Prescription() {
		driver.findElement(add_prescription).click();
		System.out.println("User clicked on Add Prescription");
	}
	
    public void Add_Prescriptions() {
	driver.findElement(add_prescription1).click();
	System.out.println("User clicked on Add Prescription");
	}

	
	public void uploads_prescription_file_from_device() throws InterruptedException {
		System.out.println("Upload the file");
		Thread.sleep(3000);
		driver.findElement(add_page).click();
		//driver.findElement(add_page).sendKeys("C:\\Users\\SAGORADE\\Desktop\\sss.png");
		Thread.sleep(10000);
		System.out.println("User uploaded file");
	}

	public void date_from_calender_in_doctor_consultation() throws Exception {
		System.out.println("Select the date");
		Thread.sleep(3000);  
		driver.findElement(calender).click();
		Thread.sleep(10000);
		System.out.println("User selected the date");
	}
	
	public void valid_character_in_record_name() throws InterruptedException {
		driver.findElement(record_name).click();
		System.out.println("Enter record name");
		//Scanner sc=new Scanner(System.in);
		//String x= sc.next();
		driver.findElement(record_name).sendKeys("Rec420Jul");
		System.out.println("User entered Record name");
		Thread.sleep(2000);
	}
	
	public void doctor_name() throws InterruptedException {
		driver.findElement(dr_name).click();
		System.out.println("Enter Doctor name");
		//Scanner sc=new Scanner(System.in);
		//String y= sc.next();
		driver.findElement(dr_name).sendKeys("A.B.Java");
		System.out.println("User entered Doctor name");
		Thread.sleep(2000);
	}

	public void Upload_Prescription_button() {
		driver.findElement(upload_prescription).click();
		System.out.println("User clicked on upload prescription ");
	}

	//Scenario 2: //
	
	public void an_error_message_after_clicking_on_Upload_Prescription() throws InterruptedException {
		String s = driver.findElement(upload_prescription_alert_warning).getText();
		System.out.println(s);
		Thread.sleep(3000);
		driver.findElement(upload_prescription_alert_button).click();
		System.out.println("User got warning for not uploading the prescription");
	}
	
	//Scenario 3: //
	
	public void Health_Conditions_tab() {
	driver.findElement(health_conditions).click();
	System.out.println("User selected Health conditions tab");
   }
	
	public void past_Health_Conditions_data() {
		System.out.println("data is not available");
	}
	
	public void Add_Health_Conditions() throws Exception  {
      Thread.sleep(2000);
		driver.findElement(add_health_data).click();
	}

	public void Add_Health_Conditions_data() throws Exception  {
		Thread.sleep(2000);
		driver.findElement(add_health_conditions).click();
		System.out.println("User clicked on Add health conditions");
	}
	
	public void date_from_calender_in_health_conditions() throws InterruptedException {
		System.out.println("Select the date");
		Thread.sleep(3000);
		driver.findElement(health_record_date).click();
		Thread.sleep(10000);
		System.out.println("User selected date");
	}
	
	public void select_checkbox_for_shown_health_conditions() {
		driver.findElement(checkbox).click(); ////check selected or not
		System.out.println("User selected checkboxes");
	}
	
	public void all_required_details() throws InterruptedException, Exception {
		FRead=new FileInputStream("C:\\JAVA TRAINING\\apollo24.xlsx");
		wb=new XSSFWorkbook(FRead);
		sh= wb.getSheet("Health");
		d1=sh.getRow(2).getCell(1).getStringCellValue();
		driver.findElement(allergy_name).click();
		System.out.println("Enter allergy name");
		driver.findElement(allergy_name).sendKeys(d1);
		//driver.findElement(allergy_name).sendKeys("Food Allergy");
		driver.findElement(not_known).click();
		driver.findElement(mild).click();
		driver.findElement(plus_sign).click();
		driver.findElement(doctor_name).click();
		d2=sh.getRow(3).getCell(1).getStringCellValue();
		System.out.println("Enter doctor name");
		driver.findElement(doctor_name).sendKeys(d2);
	//	driver.findElement(doctor_name).sendKeys("A.P.Man");
		System.out.println("Select the date");
		Thread.sleep(3000);
		driver.findElement(end_date).click();
		Thread.sleep(10000);
		System.out.println("Enter allergy reaction");
		driver.findElement(allergy_reaction).click();
		d3=sh.getRow(4).getCell(1).getStringCellValue();
		driver.findElement(allergy_reaction).sendKeys(d3);
		//driver.findElement(allergy_reaction).sendKeys("Skin Redness");
		System.out.println("User entered all required fields");
	}


	public void Upload_Data_button() {
		driver.findElement(upload_data).click();
		System.out.println("User uploaded data");
	}

	//Scenario 4: //
	public void health_conditions_without_entering_allergy_name() {
		driver.findElement(checkbox).click();
		System.out.println("User selected checkboxes");
	}
	
	public void an_error_message_after_clicking_on_Upload_Data_button_by_not_entering_required_data() {
		String s = driver.findElement(warning_message).getText();
		System.out.println(s);
		driver.findElement(warning_button).click(); 
		System.out.println("User got warning for not entering required fields");
	}
	public void close_browser() throws InterruptedException {
		Thread.sleep(2000);
	    driver.close();
	    System.out.println("Browser closed");
	}
	
	
}
