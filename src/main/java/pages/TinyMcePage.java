package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class TinyMcePage {

    private static final String FRAME = "mce_0_ifr";

    private transient SelenideElement

            editText = $("body[id='tinymce']");

    public TinyMcePage addTextInField(String enterText) {
        switchTo().frame(FRAME);
        editText.setValue(enterText);
        switchTo().defaultContent();

        return this;
    }

    public TinyMcePage switchTextFormat(Formats formats) {
        $(formats.getTextFormat()).shouldHave(Condition.visible).click();

        return this;
    }

    public TinyMcePage checkFormatText(CheckFormats checkFormats) {
        switchTo().frame(FRAME);
        $(checkFormats.getCheckFormat()).shouldHave(Condition.visible);

        return this;
    }
}
