package co.uk.mailnewspapers.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features", glue = "co.uk.mailnewspapers",tags = "not @ignore")
public class TestRunner extends AbstractTestNGCucumberTests {

}
