package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Secure page.
 */
public class SecurePage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement validationMessage = $("div[id='flash']");

    /**
     * The constructor.
     */
    public SecurePage() {
        super();
        //empty
        return;
    }

    /**
     * Method checkValidationMessage.
     *
     * @param validMessage validation message.
     * @return the secure pages.
     */
    public SecurePage checkValidationMessage(final String validMessage) {

        validationMessage.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(validMessage));

        return this;
    }
}
