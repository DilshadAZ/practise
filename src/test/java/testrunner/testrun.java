package testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resource/featurefolder"},
plugin = {"json:target/cucumber.json"},
glue = "stepdefinition")

public class testrun extends AbstractTestNGCucumberTests {
}
