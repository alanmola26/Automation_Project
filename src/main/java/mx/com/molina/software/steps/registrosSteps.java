package mx.com.molina.software.steps;

import mx.com.molina.software.page.mapeos.registroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class registrosSteps {

    @Page
    private registroPage registroPage;

    @Step("user open main page and register pop up")
    public void openRegistroPage() {
        registroPage.open();
    }

    @Step("click main sign up button")
    public void accessPopupRegister() {
        registroPage.inputMainSignUpButton.waitUntilClickable().click();
    }

    @Step("Enter Register Data")
    public void enterData(String username, String password) {
        registroPage.inputUsernameBox.type(username);
        registroPage.inputPasswordBox.type(password);
    }

    @Step("click sign up button")
    public void buttonPopupRegister() {
        registroPage.inputSignUpButton.waitUntilClickable().click();
    }


}
