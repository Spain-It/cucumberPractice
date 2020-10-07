package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path of the features folder
        features ="src/test/resources/features",
        //Path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@vip",
        dryRun = false

)
public class Runner {
}
