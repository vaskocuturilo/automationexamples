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
    private final transient SelenideElement content = $("div[id='content']");

    /**
     * The constructor.
     */
    public DifferentAuthorizationPage() {
        super();
        //empty
        return;
    }

    /**
     * Method Check validation messages basic auth.
     *
     * @param text thi si text for method.
     * @return the basic auth.
     */
    public DifferentAuthorizationPage checkValidationMessages(final String text) {
        content.waitUntil(Condition.enabled, DELAY).shouldHave(Condition.text(text));
        return this;
    }
}
