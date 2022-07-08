package step_definitions;
import java.awt.AWTException;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Health_records_page;

public class Health_Records_Test_Steps {
	Health_records_page hrp= new Health_records_page();
	
	//Background://
	
	@Given("User is on Home Page to check Health records page functionality")
	public void user_is_on_Home_Page_to_check_Health_records_page_functionality() {
	    hrp.user_is_on_Home_Page();
	}

	@When("User Navigate to LogIn Page to check Health records page functionality")
	public void user_Navigate_to_LogIn_Page_to_check_Health_records_page_functionality() {
	    hrp.user_Navigate_to_LogIn_Page();
	}

	@When("User enters Mobile Number and OTP to check Health records page functionality")
	public void user_enters_Mobile_Number_and_OTP_to_check_Health_records_page_functionality() throws Exception {
	    hrp.user_enters_Mobile_Number_and_OTP();
	}

	@Then("Message displayed Login Successfully to check Health records page functionality")
	public void message_displayed_Login_Successfully_to_check_Health_records_page_functionality() throws InterruptedException {
	   hrp.message_displayed_Login_Successfully();
	}

	@Then("click on Health records to check Health records page functionality")
	public void click_on_Health_records_to_check_Health_records_page_functionality() {
	    hrp.click_on_Health_records();
	}

	//Scenario 1: //
	
	@When("user selects Doctor Consultation tab")
	public void user_selects_Doctor_Consultation_tab() {
		hrp.selects_Doctor_Consultation_tab();
	}

	@When("user can see past consultation\\/prescription data")
	public void user_can_see_past_consultation_prescription_data() {
		hrp.past_consultation_prescription_data();
	}

	@When("user clicks on Add Prescription")
	public void user_clicks_on_Add_Prescription() {
		hrp.Add_Prescription();
	}
	
	@Then("user clicks on Add Prescriptions")
	public void user_clicks_on_Add_Prescriptions() {
	    hrp.Add_Prescriptions();
	}


	@When("user uploads prescription file from device")
	public void user_uploads_prescription_file_from_device() throws InterruptedException, AWTException {
		hrp.uploads_prescription_file_from_device();
	}

	@When("user selects date from calender in doctor consultation")
	public void user_selects_date_from_calender_in_doctor_consultation() throws InterruptedException {
		hrp.date_from_calender_in_health_conditions();
	}

	@When("enters valid character in record name")
	public void enters_valid_character_in_record_name() throws InterruptedException {
		hrp.valid_character_in_record_name();
		
	}

	@When("user enters doctor name")
	public void user_enters_doctor_name() throws InterruptedException {
		hrp.doctor_name();
	}

	@When("user clicks on [Upload Prescription] button")
	public void user_clicks_on_Upload_Prescription_button() {
		hrp.Upload_Prescription_button();
	}

	//Scenario 2: //
	
	@When("user gets an error message after clicking on [Upload Prescription] button by not entering required data.")
	public void user_gets_an_error_message_after_clicking_on_Upload_Prescription_button_by_not_entering_required_data() {
		hrp.an_error_message_after_clicking_on_Upload_Data_button_by_not_entering_required_data();
	}
	
	//Scenario 3: //
	
	@Then("user selects Health Conditions tab")
	public void user_selects_Health_Conditions_tab() {
		hrp.Health_Conditions_tab();

	}

	@Then("user can see past Health Conditions data")
	public void user_can_see_past_Health_Conditions_data() {
		hrp.past_Health_Conditions_data();
	}

	@Then("user clicks on Add Health Conditions")
	public void user_clicks_on_Add_Health_Conditions() throws Exception  {

		hrp.Add_Health_Conditions();

	}
	@Then("user clicks on Add Health Conditions data")
	public void user_clicks_on_Add_Health_Conditions_data() throws Exception  {

		hrp.Add_Health_Conditions_data();

	}

	@Then("user selects date from calender in health conditions")
	public void user_selects_date_from_calender_in_health_conditions() throws InterruptedException {
		hrp.date_from_calender_in_health_conditions();
	}

	@Then("user is able to select checkbox for shown health conditions")
	public void user_is_able_to_select_checkbox_for_shown_health_conditions() {
		hrp.select_checkbox_for_shown_health_conditions();

	}
	@Then("User enters all required details")
	public void user_enters_all_required_details() throws Exception {
		hrp.all_required_details();
	}


	@Then("user is able to click on [Upload Data] button")
	public void user_is_able_to_click_on_Upload_Data_button() {
		hrp.Upload_Data_button();
	}

	//Scenario 4: //
	
	@Then("user is able to select checkbox for shown health conditions without entering allergy name")
	public void user_is_able_to_select_checkbox_for_shown_health_conditions_without_entering_allergy_name() {
		hrp.health_conditions_without_entering_allergy_name();
	}

	@Then("user is able to get an error message after clicking on [Upload Data] button by not entering required data.")
	public void user_is_able_to_get_an_error_message_after_clicking_on_Upload_Data_button_by_not_entering_required_data() {
		hrp.an_error_message_after_clicking_on_Upload_Data_button_by_not_entering_required_data();
	}
	@Then("Close browser after checking health records page functionality")
	public void close_browser_after_checking_health_records_page_functionality() throws InterruptedException {
	    hrp.close_browser();
	}

}
