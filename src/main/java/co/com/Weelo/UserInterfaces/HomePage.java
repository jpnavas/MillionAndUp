package co.com.Weelo.UserInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target ProgramarPresentacion= Target.the("Programar presentacion button")
            .located(By.id("addressBtn"));

    public static final Target DesplegarFecha= Target.the("Lista desplegable")
            .locatedBy("//*[@id=\"scheduleForm\"]/div[3]/span[2]");

    public static final Target Month= Target.the("Month")
            .locatedBy("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[2]");

    public static final Target Day2= Target.the("Day2")
            .located(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[4]/div/div[1]"));

    public static final Target Buttton1PM= Target.the("1 pm")
            .located(By.xpath("//*[@id=\"scheduleForm\"]/div[4]/div/div/ul/li[3]"));

    public static final Target ZoomPresentation= Target.the("Zoom presentation")
            .locatedBy("//*[@id=\"scheduleForm\"]/div[6]/div/button[2]");

    public static final Target Email= Target.the("ingresar email")
            .located(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[2]/input[1]"));

    public static final Target schedule= Target.the("schedule presentation")
            .located(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[5]/button"));

    public static final Target Name= Target.the("name")
            .located(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[3]/input[1]"));

    public static final Target Phone= Target.the("phone")
            .located(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[4]/div/input"));

    public static final Target End_Button= Target.the("end Schedule")
            .located(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[5]/button/span"));

}
