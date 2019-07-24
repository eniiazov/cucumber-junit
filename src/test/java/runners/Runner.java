package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberreports",
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@multiple",
        dryRun = false
)
public class Runner {

}
