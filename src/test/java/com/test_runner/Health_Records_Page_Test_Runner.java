package com.test_runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit= "--step-notifications",
        plugin = {"json:target/cucumber.json","pretty", "html:target/HtmlReports", "junit:target/JunitReport/JunitReport.xml"},
        features = {"feature/Health_Records.feature"}
        ,glue={"step_definitions"}
        ,tags={"@Health_records"}//or 
        )

public class Health_Records_Page_Test_Runner {
	
}
