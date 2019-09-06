package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Email sent page.
 */
public class EmailSentPage {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "Your e-mail's been sent!";

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement content = $("div[id='content']");

    /**
     * The constructor.
     */
    public EmailSentPage() {
        super();
        //empty
        return;
    }

    /**
     * Confirmation sent email sent page.
     *
     * @return the email sent page
     */
    public EmailSentPage confirmationSent() {
        content.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(TEXT));
        return this;
    }

}
