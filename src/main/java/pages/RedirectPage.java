package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class RedirectPage {

    private SelenideElement

            content = $("div[id='content']");


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
