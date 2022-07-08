#Gherkin
@Appointment_page 
Feature: Appointment page functionality 
#gherkin syntax bdd framework
Background: 
	Given User is on Home Page to check appointment page functionality 
	When User Navigate to LogIn Page to check appointment page functionality  
	And User enters Mobile Number and OTP to check appointment page functionality 
	Then Message displayed Login Successfully to check appointment page functionality  
	Then click on Book appointment with doctor button to check appointment page functionality 
	
@Apollo_Appointment1
Scenario Outline:
Verify the functionality of the search bar Doctors and Specialities 
	And User Enter the Data in Search bar 
	And User Verifies whether it displays appropriate Doctors or Specailties or not '<ExpectedPage>' 
	And User Click on the Book Video Consult 
	Then Close browser after checking appointment page functionality 
	
	Examples: 
		| ExpectedPage                                                                               |
		|https://www.apollo247.com/doctors/dr-pranoti-deshpande-12dd8022-54e0-4a4b-a8b9-7625cf705ab8 |
		
@Apollo_Appointment2		
Scenario Outline:
 Verify the functionality of Book Appointment With Doctors button 
	And User Click on the Popular city '<City>' 
	And User Verifies whether it displays appropriate city or not '<ExpectedPage>' 
	Then Close browser after checking appointment page functionality 
		
	Examples: 
			| City      | ExpectedPage                                               |
			| Hyderabad |https://www.apollo247.com/doctors/doctors-in-hyderabad-dcity|
			
@Apollo_Appointment3			
Scenario Outline: Verify the functionality of Search bar 
	And User Click on the Popular city '<City>' 
	And User Enters the data in Search bar '<Specailities>' 
	And User Verifies whether it displays appropriate Specailties or not '<ExpectedData>' 
	Then Close browser after checking appointment page functionality  
			
	Examples: 
				| City      | Specailities | ExpectedData                     |
				| Hyderabad | Dermatology  | Best Dermatologists in hyderabad |
				
@Apollo_Appointment4				
Scenario Outline: Verify the functionality of book Video consult button 
	And User Click on the Popular city '<City>' 
	And User Enters the data in Search bar '<Specailities>' 
	And User Click on book Video consult 
	Then Close browser after checking appointment page functionality 
				
	Examples: 
					| City      | Specailities |
					| Hyderabad | Dermatology  | 
					
@Apollo_Appointment5					
Scenario Outline: Verify the functionality of Book Hospital visit button 
	And User Click on the Popular city '<City>' 
	And User Enters the data in Search bar '<Specailities>' 
	And User Click on Book Hospital visit 
	Then Close browser after checking appointment page functionality 
					
    Examples: 
						| City      | Specailities | 
						| Hyderabad | Dermatology  | 