package runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featurefile\\MakeMyTrip.feature", glue = { "stepdef",
		"component" }, plugin = { "pretty", "html:target/cucumber-reports" }, tags = { "@FlowTest" }, monochrome = true)
public class RunnerMakeMyTrip {
}
