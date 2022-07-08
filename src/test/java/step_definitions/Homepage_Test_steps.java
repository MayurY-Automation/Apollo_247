package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home_page;
import pages.Login_page;

public class Homepage_Test_steps{
	Home_page ho = new Home_page();
	
	//Background://
	
	@Given("User is on HomePage to check homepage functionality")
	public void user_is_on_HomePage_to_check_homepage_functionality() {
	    ho.user_is_on_HomePage();
	}

	@When("User Navigate to LogIn Page to check homepage functionality")
	public void user_Navigate_to_LogIn_Page_to_check_homepage_functionality() {
	   ho.user_Navigate_to_LogIn_Page();
	}

	@When("User enters Mobile Number and OTP to check homepage functionality")
	public void user_enters_Mobile_Number_and_OTP_to_check_homepage_functionality() throws Exception {
	    ho.user_enters_Mobile_Number_and_OTP();
	}

	@Then("Message displayed Login Successfully to check homepage functionality")
	public void message_displayed_Login_Successfully_to_check_homepage_functionality() throws InterruptedException {
	    ho.message_displayed_Login_Successfully();
	}

	//Scenario 1: //
	
	@Then("click on Book appointment with doctor button")
	public void click_on_Book_appointment_with_doctor_button() {
		ho.Book_appointment_with_doctor_button();;
	}

	@Then("Click on home button on appointment")
	public void click_on_home_button_on_appointment() {
		ho.home_button_on_appointment();

	}
	@Then("click on Health records")
	public void click_on_Health_records() {
		ho.Health_records();
	}

	@Then("Click on home button on helath records")
	public void click_on_home_button_on_helath_records() {
		ho.home_button_on_helath_records();
	}
	@Then("Click on Book lab test")
	public void click_on_Book_lab_test() {
		ho.Book_lab_test();
	}

	@Then("Click on home button on lab test")
	public void click_on_home_button_on_lab_test() {
		ho.home_button_on_lab_test();
	}
	@Then("Click on Circle button")
	public void click_on_Circle_button() {
		ho.Circle_button();
	}
	@Then("Click on home button on circle")
	public void click_on_home_button_on_circle() {
		ho.home_button_on_circle();
	}

	@Then("Click on Cart button")
	public void click_on_Cart_button() {
		ho.Cart_button();
	}
	@Then("Click on home button on cart")
	public void click_on_home_button_on_cart() {
		ho.home_button_on_cart();
	}
	@Then("Click on buy medicines and essentials")
	public void click_on_buy_medicines_and_essentials() {
		ho.medicines_and_essentials();
	}
	
	@Then("Close browser after checking homepage functionality")
	public void close_browser_after_checking_homepage_functionality() {
	    ho.close_browser();
	}


}