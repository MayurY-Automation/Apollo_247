#Gherkin
@Apollo_Login 
Feature: Login Action 
#gherkin syntax bdd framework
Background: 
	Given User is on Home Page 
	When User Navigate to LogIn Page 
	
@Valid_Login 
Scenario: Successful Login with Valid Credentials 
	And User enters Mobile Number and OTP 
	Then Message displayed Login Successfully 
	Then Close browser 
	
@Invalid_Mobile_Number 
Scenario: To validate invalid mobile number 
	And Enter invalid mobile number 
	Then Error message for invalid mobile number should be displayed 
	Then Close browser 
	
@Invalid_OTP 
Scenario: To validate invalid OTP 
	And User enters Mobile Number and OTP 
	Then Error message for invalid OTP should be displayed 
	Then Close browser 