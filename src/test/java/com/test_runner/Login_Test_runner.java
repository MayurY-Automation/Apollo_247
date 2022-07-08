package com.test_runner;

import org.junit.runner.RunWith;

import com.aventstack.extentreports.gherkin.model.Feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        junit= "--step-notifications",
        plugin = {"json:target/cucumber.json","pretty", "html:target/HtmlReports","junit:target/JunitReport/JunitReport.xml"},
        features = "Feature"
        ,glue={"step_definitions"}
        ,tags={"@Apollo_Login"}//or 
        )

public class Login_Test_runner {

}


