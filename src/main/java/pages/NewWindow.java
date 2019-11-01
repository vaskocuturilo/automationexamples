package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class New window.
 */
public class NewWindow {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "New Window";

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement text = $("div[class='example'] h3");

    /**
     * The default constrictor.
     */
    public NewWindow() {
        super();
        //empty
        return;
    }

    /**
     * Method Check that open new window new window.
     *
     * @return the new window.
     */
    public NewWindow checkThatOpenNewWindow() {
        text.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(TEXT));
        return this;
    }
}
