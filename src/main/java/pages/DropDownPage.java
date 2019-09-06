package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Drop down pages.
 */
public class DropDownPage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * private Selenide Elements.
     */
    private final transient SelenideElement selector = $("select[id='dropdown']");

    /**
     * The constructor.
     */
    public DropDownPage() {
        super();
        //empty
        return;
    }

    /**
     * Select text drop down pages.
     *
     * @param text the text.
     * @return the drop down pages.
     */
    public DropDownPage selectText(final String text) {

        selector.waitUntil(Condition.enabled, DELAY).selectOptionContainingText(text);

        return this;
    }
}
