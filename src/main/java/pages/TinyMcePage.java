package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * The class Tiny mce page.
 */
@SuppressWarnings({"PMD.LawOfDemeter", "PMD.AtLeastOneConstructor"})
public class TinyMcePage {

    /**
     * The constant FRAME.
     */
    private static final String FRAME = "mce_0_ifr";

    /**
     * The private Selenide Element.
     */
    protected transient SelenideElement editText = $("body[id='tinymce']");

    /**
     * Method addTextInField.
     *
     * @param enterText This is text which user added in text field.
     * @return this page.
     */
    public TinyMcePage addTextInField(final String enterText) {
        switchTo().frame(FRAME);
        editText.setValue(enterText);
        switchTo().defaultContent();

        return this;
    }

    /**
     * Method switchTextFormat.
     *
     * @param formats this is value from enum Formats. You may select BOLD or ITALIC.
     * @return this page.
     */
    public TinyMcePage switchTextFormat(final Formats formats) {
        $(formats.getTextFormat()).shouldHave(Condition.visible).click();

        return this;
    }

    /**
     * Method checkFormatText.
     *
     * @param checkFormats this is value from enum CheckFormats. You may select BOLD or ITALIC.
     * @return this page.
     */
    public TinyMcePage checkFormatText(final CheckFormats checkFormats) {
        switchTo().frame(FRAME);
        $(checkFormats.getCheckFormat()).shouldHave(Condition.visible);

        return this;
    }
}
