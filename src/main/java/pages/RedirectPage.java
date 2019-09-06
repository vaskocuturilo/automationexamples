package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

/**
 * The type Redirect page.
 */
public class RedirectPage {

    /**
     * The privaye Selenide Element.
     */
    private final transient SelenideElement content = $("div[id='content']");

    /**
     * The constructor.
     */
    public RedirectPage() {
        super();
        //empty
        return;
    }

    /**
     * Check status code redirect page.
     *
     * @return the redirect page
     */
    public RedirectPage checkStatusCode() {

        assertEquals("Status Codes", content.$("h3").getText());

        content.$("ul").shouldHave(
                Condition.text("200"),
                Condition.text("301"),
                Condition.text("404"),
                Condition.text("500"));
        return this;
    }
}
