package mx.com.molina.software.page.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.demoblaze.com/#")
public class registroPage extends PageObject {

    @FindBy(xpath = "//a[@id='signin2']") //Boton de Sign up
    public WebElementFacade inputMainSignUpButton;

    @FindBy(id = "sign-username")
    public WebElementFacade inputUsernameBox;

    @FindBy(id = "sign-password")
    public WebElementFacade inputPasswordBox;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    public WebElementFacade inputSignUpButton;
}
