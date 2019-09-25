package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The type Notification message.
 */
public class NotificationMessage {

    /**
     * The constant ACTION.
     */
    private static final String ACTION = " Action";


    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement

            actionText = $("div[id='flash-messages']"),
            linkForClick = $("div[class='example'] a");

    /**
     * The constructor.
     */
    public NotificationMessage() {
        super();
        //empty
        return;
    }

    /**
     * Generate notification message notification message.
     *
     * @return the notification message
     */
    public NotificationMessage checkNotificationMessage() {

        linkForClick.click();

        checkTextOnPage(ACTION);

        return this;
    }


    /**
     * Method checkTextOnPage.
     *
     * @param textMessage this is text message for check assert.
     */
    private void checkTextOnPage(final String textMessage) {

        actionText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(textMessage));

    }


}
