package step_definitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Medicines_page;

public class Medicines_Test_Steps {
	Medicines_page med= new Medicines_page();
	
	//Background://	
	
	@Given("User is on Home Page to check medicines page functionality")
	public void user_is_on_Home_Page_to_check_medicines_page_functionality() {
	   
		med.user_is_on_HomePage();
	}

	@When("User Navigate to LogIn Page to check medicines page functionality")
	public void user_Navigate_to_LogIn_Page_to_check_medicines_page_functionality() {
	    
		med.user_Navigate_to_LogIn_Page();
	}

	@When("User enters Mobile Number and OTP to check medicines page functionality")
	public void user_enters_Mobile_Number_and_OTP_to_check_medicines_page_functionality() throws Exception {
	   
		med.user_enters_Mobile_Number_and_OTP();
	}

	@Then("Message displayed Login Successfully to check medicines page functionality")
	public void message_displayed_Login_Successfully_to_check_medicines_page_functionality() throws InterruptedException {
	  
		med.message_displayed_Login_Successfully();
	}

	//Scenario 1://	
	
	@Then("Click on buy medicines and essentials to check medicines page functionality")
	public void click_on_buy_medicines_and_essentials_to_check_medicines_page_functionality() {
	   
		med.medicines_and_essentials();
	}
	
	@Then("User clicks search medicines and more")
	public void user_clicks_search_medicines_and_more() throws Exception {
		
		med.search_medicines_and_more();	
	}

	@Then("User clicks on add to cart")
	public void user_clicks_on_add_to_cart() throws Exception {
		
		med.add_to_cart();
		
	}

	@Then("User clicks on review order")
	public void user_clicks_on_review_order() throws Exception {
		med.review_order();
		
	}

	@Then("User clicks on proceed to pay")
	public void user_clicks_on_proceed_to_pay() throws Exception {
		
		med.proceed_to_pay();
	}

	@Then("Close browser after checking medicines page functionality")
	public void close_browser_after_checking_medicines_page_functionality() {
	   
		med.close_browser();
	
	}


	
}
