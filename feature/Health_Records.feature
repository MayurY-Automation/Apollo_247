#Gherkin
@Health_records 
Feature: Health records functionality 
#gherkin syntax bdd framework

Background: 
	Given User is on Home Page to check Health records page functionality
	When User Navigate to LogIn Page to check Health records page functionality
	And User enters Mobile Number and OTP to check Health records page functionality
	Then Message displayed Login Successfully to check Health records page functionality
	And  click on Health records to check Health records page functionality
			
@Doctor_Consultations1
Scenario: Check the functionality of "Doctor Consultations" tab 
	And  user selects Doctor Consultation tab 
	And  user can see past consultation/prescription data 
	And  user clicks on Add Prescription 
	And  user uploads prescription file from device 
	And  user selects date from calender in doctor consultation
	And  enters valid character in record name 
	And  user enters doctor name 
	And  user clicks on [Upload Prescription] button
	Then Close browser after checking health records page functionality 
	
	@Doctor_Consultations2
Scenario: Check the functionality of "Doctor Consultations" tab without uploading file 
	And  user selects Doctor Consultation tab 
	And  user can see past consultation/prescription data 
	And  user clicks on Add Prescriptions
	And  user selects date from calender in doctor consultation 
	And  enters valid character in record name 
	And  user enters doctor name 
	And  user clicks on [Upload Prescription] button 
	And  user gets an error message after clicking on [Upload Prescription] button by not entering required data.
	Then Close browser after checking health records page functionality   
	  
@Health_Conditions1
Scenario: Check the functionality of "Health Conditions" tab 
	And user selects Health Conditions tab 
	And user can see past Health Conditions data 
	And user clicks on Add Health Conditions 
	And user selects date from calender in health conditions 
	And  user is able to select checkbox for shown health conditions 
	And User enters all required details
	And user is able to click on [Upload Data] button 
	Then Close browser after checking health records page functionality   
	
@Health_Conditions2
Scenario: Check the functionality of "Health Conditions" tab without entering allergy name
	And user selects Health Conditions tab 
	And user can see past Health Conditions data 
	And user clicks on Add Health Conditions data 
	And user selects date from calender in health conditions 
	And  user is able to select checkbox for shown health conditions without entering allergy name 
	And user is able to click on [Upload Data] button 
	And user is able to get an error message after clicking on [Upload Data] button by not entering required data. 
	Then Close browser after checking health records page functionality 