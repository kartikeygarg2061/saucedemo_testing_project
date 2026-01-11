package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features/login.feature", "src/test/resources/features/productpage.feature", "src/test/resources/features/cartandcheckout.feature"},
		glue = {"stepdef", "baseclass"},
		plugin = "pretty"
		)

public class runner extends AbstractTestNGCucumberTests {

}
