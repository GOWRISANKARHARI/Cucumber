package runner;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	@CucumberOptions(plugin={"pretty", "json:target/cucumber-reports/Cucumber.json"},features= "src/test/resources/com/ogin.feature",glue="stepDef")
public class assation  extends AbstractTestNGCucumberTests{

}
