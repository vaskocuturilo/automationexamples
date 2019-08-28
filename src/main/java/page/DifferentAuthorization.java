package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * The class Basic auth.
 */
public class DifferentAuthorization {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Constant CHECK_TEXT.
     */


    private SelenideElement
            content = $("div[id='content']");

    /**
     * Method Check validation messages basic auth.
     *
     * @return the basic auth.
     */
    public DifferentAuthorization checkValidationMessages(String text) {
        content.waitUntil(Condition.enabled, DELAY).shouldHave(Condition.text(text));
        return this;
    }
}
