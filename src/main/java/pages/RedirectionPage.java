package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class RedirectionPage {


    private static SelenideElement

    content = $("div[id='content']");

    public RedirectPage usingRedirection(){

        assertEquals("Redirection", content.$("h3").getText());

        content.$("a").shouldHave(Condition.text("here")).click();

        return new RedirectPage();
    }
}
