package runner;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber4.html"},features= "src/test/resources/com/ogin.feature",glue="stepDef")
public class assation  extends AbstractTestNGCucumberTests{

}
