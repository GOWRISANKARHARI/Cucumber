package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber1.html"},features= "src/test/resources/com/ogin.feature",glue="stepDef")
	//it is mainly used for the location of the process of the location of the report in junit so there are 3 type of the report of the process 
	public class runnerTest {
		

}
