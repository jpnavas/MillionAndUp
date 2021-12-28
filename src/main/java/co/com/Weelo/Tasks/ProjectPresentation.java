package co.com.Weelo.Tasks;

import co.com.Weelo.UserInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ProjectPresentation implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.ProgramarPresentacion,isPresent()),
                JavaScriptClick.on(HomePage.ProgramarPresentacion),
                WaitUntil.the(HomePage.DesplegarFecha,isPresent()),
                JavaScriptClick.on(HomePage.DesplegarFecha),
                JavaScriptClick.on(HomePage.Month),
                JavaScriptClick.on(HomePage.Month),
                WaitUntil.the(HomePage.Day2,isPresent()),
                Click.on(HomePage.Day2),
                Click.on(HomePage.Buttton1PM),
                Click.on(HomePage.ZoomPresentation),
                WaitUntil.the(HomePage.Email,isClickable()),
                Enter.theValue("jpablo-na993@hotmail.com").into(HomePage.Email),
                Click.on(HomePage.schedule),
                WaitUntil.the(HomePage.Name,isClickable()),
                Enter.theValue("Juan Pablo Navas").into(HomePage.Name),
                Enter.theValue("3152875280").into(HomePage.Phone),
                Click.on(HomePage.End_Button)
        );
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static ProjectPresentation presentation() {

        return instrumented(ProjectPresentation.class);
    }
}
