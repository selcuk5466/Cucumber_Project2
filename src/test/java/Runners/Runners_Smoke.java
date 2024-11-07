package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"}
)
public class Runners_Smoke extends AbstractTestNGCucumberTests {
}
