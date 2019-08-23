package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

/**
 * The class Basic auth.
 */
public class BasicAuth {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Constant CHECK_TEXT.
     */
    private static final String CHECK_TEXT = "Basic Auth";

    /**
     * Method Check validation messages basic auth.
     *
     * @return the basic auth.
     */
    public BasicAuth checkValidationMessages() {
        $("div[id='content']").waitUntil(Condition.enabled, DELAY).shouldHave(Condition.text(CHECK_TEXT));
        return this;
    }
}
