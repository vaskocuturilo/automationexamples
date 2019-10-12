package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;


/**
 * The class Alerts page.
 */
public class AlertsPage {

    /**
     * Constant TEXT.
     */
    private static final String TEXT = "null";

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;


    /**
     * The private Selenide elements.
     */
    private final transient SelenideElement alert = $("button[onclick='jsAlert()']"),
            confirm = $("button[onclick='jsConfirm()']"),
            prompt = $("button[onclick='jsPrompt()']"),
            result = $("p[id='result']");

    /**
     * The constructor.
     */
    public AlertsPage() {
        super();
        //empty
        return;
    }

    /**
     * Js alerts alerts page.
     *
     * @return the alerts page
     */
    public AlertsPage javaScriptAlerts() {

        alert.click();
        switchTo().alert().accept();


        return this;
    }

    /**
     * Js confirm alerts page.
     *
     * @return the alerts page
     */
    public AlertsPage javaScriptConfirm() {

        confirm.click();
        switchTo().alert().accept();

        return this;
    }

    /**
     * Js prompt alerts page.
     *
     * @return the alerts page
     */
    public AlertsPage javaScriptPrompt() {

        prompt.click();
        switchTo().alert().sendKeys(TEXT);

        return this;
    }


    /**
     * Confirmation result alerts page.
     *
     * @return the alerts page
     */
    public AlertsPage confirmationResult() {
        result.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(TEXT));
        return this;
    }

}
