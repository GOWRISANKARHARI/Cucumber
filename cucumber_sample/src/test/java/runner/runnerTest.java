package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(plugin={"pretty","json:target/cucumber-reports/Cucumber10.json"},features= "src/test/resources/com/ogin.feature",glue="stepDef")
	//it is mainly used for the location of the process of the location of the report in junit so there are 3 type of the report of the process 
	public class runnerTest {
		

}
