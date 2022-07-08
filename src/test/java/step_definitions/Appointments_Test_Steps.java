package step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Appointments_page;


public class Appointments_Test_Steps {
	
	Appointments_page appoint = new Appointments_page();
	
	//Background//
	
	@Given("User is on Home Page to check appointment page functionality")
	public void user_is_on_Home_Page_to_check_appointment_page_functionality() {
	 appoint.user_is_on_Home_Page();   
	}

	@When("User Navigate to LogIn Page to check appointment page functionality")
	public void user_Navigate_to_LogIn_Page_to_check_appointment_page_functionality() {
	    appoint.user_Navigate_to_LogIn_Page();
	}

	@When("User enters Mobile Number and OTP to check appointment page functionality")
	public void user_enters_Mobile_Number_and_OTP_to_check_appointment_page_functionality() throws Exception {
	    appoint.user_enters_Mobile_Number_and_OTP();
	}

	@Then("Message displayed Login Successfully to check appointment page functionality")
	public void message_displayed_Login_Successfully_to_check_appointment_page_functionality() throws InterruptedException {
	    appoint.message_displayed_Login_Successfully();
	}

	@Then("click on Book appointment with doctor button to check appointment page functionality")
	public void click_on_Book_appointment_with_doctor_button_to_check_appointment_page_functionality() {
	    appoint.click_on_Book_appointment_with_doctor();
	}

	//Scenario 1://
	
	@Then("User Enter the Data in Search bar")
	public void user_Enter_the_Data_in_Search_bar() throws InterruptedException {
		appoint.Enter_the_Data_in_Search_bar();
	}

	@Then("User Verifies whether it displays appropriate Doctors or Specailties or not {string}")
	public void user_Verifies_whether_it_displays_appropriate_Doctors_or_Specailties_or_not(String ExpectedPage)
			throws InterruptedException {
		appoint.Verifies_whether_it_displays_appropriate_Doctors_or_Specailties_or_not(ExpectedPage);
	}

	@Then("User Click on the Book Video Consult")
	public void User_Click_on_the_Book_Video_Consult() {
		appoint.Click_on_the_Book_Video_Consult();
	}

	// Scenario 2://
	
	@Then("User Click on the Popular city {string}")
	public void user_Click_on_the_Popular_city(String string) {
		appoint.Click_on_the_Popular_city(string);
	}

	@Then("User Verifies whether it displays appropriate city or not {string}")
	public void user_Verifies_whether_it_displays_appropriate_city_or_not(String ExpectedPage)
			throws InterruptedException {
		appoint.Verifies_whether_it_displays_appropriate_city_or_not(ExpectedPage);
	}


	//Scenario 3://

	@Then("User Enters the data in Search bar {string}")
	public void user_Enters_the_data_in_Search_bar(String string) {
		appoint.Enters_the_data_in_Search_bar(string);
	}

	@Then("User Verifies whether it displays appropriate Specailties or not {string}")
	public void user_Verifies_whether_it_displays_appropriate_Specailties_or_not(String ExpectedData)
			throws InterruptedException {
		appoint.Verifies_whether_it_displays_appropriate_Specailties_or_not(ExpectedData);
	}

	// Scenario 4://
	
	@Then("User Click on book Video consult")
	public void user_Click_on_book_Video_consult() {
		appoint.Click_on_book_Video_consult();
	}

	// Scenario 5://
	
	@Then("User Click on Book Hospital visit")
	public void User_Click_on_Book_Hospital_visit() throws InterruptedException {
		appoint.Click_on_Book_Hospital_visit();
	}

	@Then("Close browser after checking appointment page functionality")
	public void close_browser_after_checking_appointment_page_functionality() {
		appoint.close_browser();
	}
}
