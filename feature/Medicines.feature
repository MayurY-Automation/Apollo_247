#Gherkin
@Medicines_page
Feature: Medicine page functionality
#gherkin syntax bdd framework
Background: 
	Given User is on Home Page to check medicines page functionality
	When User Navigate to LogIn Page to check medicines page functionality
	And User enters Mobile Number and OTP to check medicines page functionality
	Then Message displayed Login Successfully to check medicines page functionality
	And Click on buy medicines and essentials to check medicines page functionality	 
@Medicines
Scenario: Verify the functionality of the medicines and pharmacy
	Then User clicks search medicines and more
	And User clicks on add to cart
	And User clicks on review order
	And User clicks on proceed to pay 
	Then Close browser after checking medicines page functionality
