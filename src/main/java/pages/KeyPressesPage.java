package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Key presses page.
 */
public class KeyPressesPage {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "You entered: ESCAPE";

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide elements.
     */
    private final transient SelenideElement
            inputForKeys = $("input[id='target']"),
            result = $("p[id='result']");

    /**
     * The constructor.
     */
    public KeyPressesPage() {
        super();
        //empty
        return;
    }

    /**
     * Use key button key presses page.
     *
     * @param key the key
     * @return the key presses page
     */
    public KeyPressesPage useKeyButton(final Keys key) {

        inputForKeys.setValue(String.valueOf(key));

        result.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(TEXT));

        return this;
    }
}
