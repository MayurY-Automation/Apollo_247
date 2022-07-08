package com.test_runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit= "--step-notifications",
        plugin = {"json:target/cucumber.json","pretty", "html:target/HtmlReports","junit:target/JunitReport/JunitReport.xml"},
        features = {"feature/Lab_Test.feature"}
        ,glue={"step_definitions"}
        ,tags={"@Lab_Test"}//or 
        )
public class Lab_Tests_Page_Test_Runner {

}
