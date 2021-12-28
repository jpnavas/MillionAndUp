package co.com.Weelo.StepDefinitions;

import co.com.Weelo.Tasks.OpenBrowser;
import co.com.Weelo.Tasks.ProjectPresentation;
import co.com.Weelo.UserInterfaces.Url;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition  {

    public static final String Archivo = "C:\\Users\\juan.navas\\Documents\\Davivienda\\Flight.properties";
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Go to the application$")
    public void goToTheApplication() {
        theActorCalled("Juan").attemptsTo(
                OpenBrowser.openUrl(Url.VIVAAIR));

    }
    @When("^into project presentation$")
    public void intoprojectpresentatio()  {
        theActorInTheSpotlight().attemptsTo(
                ProjectPresentation.presentation());




    }


}
