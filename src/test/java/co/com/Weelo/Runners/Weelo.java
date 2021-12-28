package co.com.Weelo.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/MillionAndUp.feature",
        glue = "co.com.Weelo.StepDefinitions",
        //tags = "",
        snippets = SnippetType.CAMELCASE)
public class Weelo {
}
