package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SecurePage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    private SelenideElement
            validationMessage = $("div[id='flash']");
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
