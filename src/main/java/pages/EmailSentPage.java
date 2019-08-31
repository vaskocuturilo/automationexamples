package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EmailSentPage {

    private static final String TEXT = "Your e-mail's been sent!";


    private SelenideElement

    content = $("div[id='content']");


    public EmailSentPage confirmationSent(){

        content.waitUntil(Condition.visible, 5000).shouldHave(Condition.text(TEXT));


    return this;
    }

}
