package step_definitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Lab_tests_page;

public class Lab_Tests_Test_Steps {
	Lab_tests_page lab=new Lab_tests_page();
	
	//Background://
	
	@Given("User is on Home Page to check lab test page functionality")
	public void user_is_on_Home_Page_to_check_lab_test_page_functionality() {
	    lab.user_is_on_Home_Page();
	}

	@When("User Navigate to LogIn Page to check lab test page functionality")
	public void user_Navigate_to_LogIn_Page_to_check_lab_test_page_functionality() {
	    lab.user_Navigate_to_LogIn_Page();
	}

	@When("User enters Mobile Number and OTP to check lab test page functionality")
	public void user_enters_Mobile_Number_and_OTP_to_check_lab_test_page_functionality() throws Exception {
	    lab.user_enters_Mobile_Number_and_OTP();
	}

	@Then("Message displayed Login Successfully to check lab test page functionality")
	public void message_displayed_Login_Successfully_to_check_lab_test_page_functionality() throws InterruptedException {
	    lab.message_displayed_Login_Successfully();
	}

	@Then("User clicks on Book Lab Tests button to check lab test page functionality")
	public void user_clicks_on_Book_Lab_Tests_button_to_check_lab_test_page_functionality() {
		lab.Book_Lab_Tests_button();
	}
	
	//Scenario 1://
	
	@Then("User clicks on Book Lab Tests button")
	public void user_clicks_on_Book_Lab_Tests_button() {
		lab.Book_Lab_Tests_button();

	}

	@Then("User Enter the test name in Search bar and press enter")
	public void User_Enter_the_test_name_in_Search_bar_and_press_enter() throws Exception {
		lab.Enter_the_test_name_in_Search_bar_and_press_enter();
	}

	@Then("User selects the required test from suggestions")
	public void user_selects_the_required_test_from_suggestions() throws Exception {
		lab.select_the_required_test_from_suggestions();
	}

	@Then("User adds the selected test to cart")
	public void user_adds_the_selected_test_to_cart() throws Exception {
		lab.add_the_selected_test_to_cart();

	}

	@Then("User clicks on go to cart button")
	public void User_clicks_on_go_to_cart_button() throws Exception {
        lab.go_to_cart_button();

	}


	@Then("User selects patient name")
	public void User_selects_patient_name() throws Exception {
        lab.selects_patient_name();
		
	}

	@Then("User proceeds to select tests page")
	public void user_proceeds_to_select_tests_page() throws Exception {

		lab.select_tests_page();

	}

	@Then("User selects the address")
	public void user_selects_the_address() throws Exception {
           lab.selects_the_address();
		
	}

	@Then("User selects slot for the appointment")
	public void user_selects_slot_for_the_appointment() throws Exception {
         lab.selects_slot_for_the_appointment();
	}
	
	@Then("Close browser after checking lab test page functionality")
	public void close_browser_after_checking_lab_test_page_functionality() {
	   lab.close_browser();
	}
}
