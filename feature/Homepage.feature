#Gherkin
@Apollo_Homepage 
Feature: Homepage functionality 
#gherkin syntax bdd framework
Background: 
	Given User is on HomePage to check homepage functionality
	When User Navigate to LogIn Page to check homepage functionality
	And User enters Mobile Number and OTP to check homepage functionality
	Then Message displayed Login Successfully to check homepage functionality
	
@Apollo_Homepage 
Scenario: To validate Homepage functionality 
	Then click on Book appointment with doctor button 
	And Click on home button on appointment 
	Then click on Health records 
	And Click on home button on helath records 
	And Click on Book lab test 
	And Click on home button on lab test 
	And Click on Circle button 
	And Click on home button on circle 
	And Click on Cart button 
	And Click on home button on cart 
	And Click on buy medicines and essentials 
	Then Close browser after checking homepage functionality