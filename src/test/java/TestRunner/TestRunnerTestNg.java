package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
		features = {"src/test/java/Feature"},
		glue = {"JavaStepDefinations"},
		tags = "",
		plugin = {"pretty","rerun:target/rerun.txt","html:target/report.html"},
		monochrome = true,
		dryRun = false)
public class TestRunnerTestNg extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)  // Enable parallel execution
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
