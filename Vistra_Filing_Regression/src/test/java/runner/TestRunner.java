package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "stepRunner" }, plugin = { "html:target/cucumber-html-report" })

public class TestRunner {

}
