package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * The class Basic auth.
 */
public class DifferentAuthorizationPage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Private selenide element.
     */
    private SelenideElement
            content = $("div[id='content']");

    /**
     * Method Check validation messages basic auth.
     *
     * @return the basic auth.
     */
    public DifferentAuthorizationPage checkValidationMessages(String text) {
        content.waitUntil(Condition.enabled, DELAY).shouldHave(Condition.text(text));
        return this;
    }
}
