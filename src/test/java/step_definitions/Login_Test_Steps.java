package step_definitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Health_records_page;
import pages.Login_page;

public class Login_Test_Steps {
	Login_page log = new Login_page();

	public WebDriver driver;
	
/* @Before
	public void openBrowsser() {
		log.open_browser();
	}
	*/
	
	//Background://
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() throws Exception {
		log.launchApp();
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		log.profile();

	}

	//Scenario 1://
	
	@When("User enters Mobile Number and OTP")
	public void user_enters_Mobile_Number_and_OTP() throws Exception {
	 log.mobileNumber();
	 log.manualOtp();
	 log.clickSubmit();
   
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws Exception {
		log.message_displayed();	
	}
	
	//Scenario 2://
	
	@When("Enter invalid mobile number")
	public void enter_invalid_mobile_number() throws IOException {
		log.invalid_mobile_no();
	}

	@Then("Error message for invalid mobile number should be displayed")
	public void error_message_for_invalid_mobile_number_should_be_displayed() throws FileNotFoundException {
		log.message_invalid_mobile_no();
	}
   
	//Scenario 3://
	
	@Then("Error message for invalid OTP should be displayed")
	public void error_message_for_invalid_OTP_should_be_displayed() {
		log.message_invalid_otp();
	}
	@Then("Close browser")
	public void close_browser() {
		log.close_browser();
	}

}
