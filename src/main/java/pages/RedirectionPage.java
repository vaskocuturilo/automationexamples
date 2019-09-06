package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

/**
 * The type Redirection page.
 */
public class RedirectionPage {

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement content = $("div[id='content']");

    /**
     * The constant HERE.
     */
    private static final String HERE = "here";

    /**
     * The constant REDIRECT.
     */
    private static final String REDIRECT = "Redirection";

    /**
     * The constructor.
     */
    public RedirectionPage() {
        super();
        //empty
        return;
    }

    /**
     * Using redirection redirect page.
     *
     * @return the redirect page
     */
    public RedirectPage usingRedirection() {

        assertEquals(REDIRECT, content.$("h3").getText());

        content.$("a").shouldHave(Condition.text(HERE)).click();

        return new RedirectPage();
    }
}
