package com.test_runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit= "--step-notifications",
        plugin = {"json:target/cucumber.json","pretty", "html:target/HtmlReports","junit:target/JunitReport/JunitReport.xml"},
        features = {"feature/Appointment.feature"}
        ,glue={"step_definitions"}
        ,tags={"@Appointment_page"}//or 
        )
public class Appointments_Page_Test_Runner {

}
