package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The type Modal window page.
 */
public class ModalWindowPage {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).";

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement

            textOnModalWindow = $("div[class='modal-body'] p"),
            closeModalWindow = $("div[class='modal-footer'] p");

    /**
     * The constructor.
     */
    public ModalWindowPage() {
        super();
        //empty
        return;
    }

    /**
     * The method assertAndCloseModalWindow.
     *
     * @return the modal window page
     */
    public ModalWindowPage assertAndCloseModalWindow() {

        textOnModalWindow.waitUntil(Condition.visible, 5000).shouldHave(Condition.text(TEXT));
        closeModalWindow.click();

        return this;
    }


}
