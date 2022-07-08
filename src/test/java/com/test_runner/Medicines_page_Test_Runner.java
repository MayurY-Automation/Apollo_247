package com.test_runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit= "--step-notifications",
        plugin = {"json:target/cucumber.json","pretty", "html:target/HtmlReports","junit:target/JunitReport/JunitReport.xml"},
        features = {"feature/Medicines.feature"}
        ,glue={"step_definitions"}
        ,tags={"@Medicines_page"}//or 
        )
public class Medicines_page_Test_Runner {

}
