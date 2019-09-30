package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertTrue;


/**
 * The type Disappearing elements page.
 */
public class DisappearingElementsPage {

    /**
     * Private selenide element .
     */
    private final transient ElementsCollection elementsHeader = $$("div[id='content'] li");

    /**
     * Constant verifyText.
     */
    private final transient SelenideElement verifyText = $("h1");

    /**
     * Constant TEXT.
     */
    private static final String TEXT = "Not Found";

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The default constructor.
     */
    public DisappearingElementsPage() {
        super();
        //empty
        return;
    }

    /**
     * Assert pages after transition.
     *
     * @return the disappearing elements page
     */
    public DisappearingElementsPage assertPagesAfterTransition() {

        for (int i = 1; i < elementsHeader.toArray().length; i++) {

            elementsHeader.get(i).click();
            verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(TEXT));
            assertTrue(url().contains("/"));
            WebDriverRunner.getWebDriver().navigate().back();
        }
        return this;
    }

}
