package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		    plugin = {"json:target/cucumber-reports/Cucumber.json"},
		    features = "src/test/resources/features",
		    glue = "stepDefinitions"
		)
	public class runnerTest {
		

}
