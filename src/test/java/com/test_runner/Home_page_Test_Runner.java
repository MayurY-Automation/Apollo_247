package com.test_runner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import utils.SetupDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit= "--step-notifications",
        plugin = {"json:target/cucumber.json","pretty", "html:target/HtmlReports","junit:target/JunitReport/JunitReport.xml"},
        features = {"feature/Homepage.feature"}
        ,glue={"step_definitions"}
        ,tags={"@Apollo_Homepage"}//or 
        )
public class Home_page_Test_Runner {
	 
	/*@After
	    public void teardown() {
	        SetupDriver.teardown();
	    }*/
}
