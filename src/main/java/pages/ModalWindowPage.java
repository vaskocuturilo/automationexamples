package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ModalWindowPage {

    private static final String TEXT = "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).";

    private SelenideElement

    textOnModalWindow = $("div[class='modal-body'] p"),
    closeModalWindow = $("div[class='modal-footer'] p");

    public ModalWindowPage assertAndCloseModalWindow() {

        textOnModalWindow.waitUntil(Condition.visible, 5000).shouldHave(Condition.text(TEXT));
        closeModalWindow.click();

        return this;
    }


}
