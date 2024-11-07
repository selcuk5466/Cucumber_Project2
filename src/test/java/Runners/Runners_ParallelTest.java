package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"}
)
public class Runners_ParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserTipi){
        GWD.threadBrowserName.set(browserTipi);
    }
}
