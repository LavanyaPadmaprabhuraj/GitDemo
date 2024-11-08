package cucumber.Options;
//commands to run ->mvn test
// mvn test -Dcucumber.options="__tags@AddPlace"
//>mvn test -Dcucumber.options="_ _tags @DeletePlace"
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",plugin ="json:target/jsonReports/cucumber-report.json",glue= {"stepDefinations"})
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}
