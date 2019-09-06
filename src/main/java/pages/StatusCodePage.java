package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertTrue;


/**
 * The type Status code page.
 */
public class StatusCodePage {

    /**
     * The private ElementsCollection.
     */
    private final transient ElementsCollection content = $$("div[id='content'] li a");

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement linkContent = $("div[id='content'] a");

    /**
     * The constructor.
     */
    public StatusCodePage() {
        super();
        //empty
        return;
    }

    /**
     * Check list status code page.
     *
     * @return the status code page
     */
    public StatusCodePage checkStatusCodeContent() {

        for (int i = 0; i < content.toArray().length; i++) {
            final String statusCode = content.get(i).getText();
            content.get(i).click();
            assertTrue(url().contains("/status_codes/" + statusCode));
            linkContent.click();
        }
        return this;
    }
}
