#Gherkin
@Lab_Test
Feature: Lab Test functionality 
#gherkin syntax bdd framework
Background: 
	Given User is on Home Page to check lab test page functionality
	When User Navigate to LogIn Page to check lab test page functionality
	And User enters Mobile Number and OTP to check lab test page functionality
	Then Message displayed Login Successfully to check lab test page functionality
	Then User clicks on Book Lab Tests button to check lab test page functionality
#Book Lab Tests

@Lab_Tests_1
Scenario: Verify the functionality of the search bar for "Search tests and packages"  
	And User Enter the test name in Search bar and press enter
	And User selects the required test from suggestions
	And User adds the selected test to cart 
	Then User clicks on go to cart button
	And User selects patient name
	And User proceeds to select tests page
	And User selects the address 
	And User selects slot for the appointment 
	Then Close browser after checking lab test page functionality
	