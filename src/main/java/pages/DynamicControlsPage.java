package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Dynamic controls page.
 */
public class DynamicControlsPage {

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The constant GONE_TEXT.
     */
    private static final String GONE_TEXT = "It's gone!";

    /**
     * The constant BACK_TEXT.
     */
    private static final String BACK_TEXT = "It's back!";

    /**
     * The constant ENABLED_TEXT.
     */
    private static final String ENABLED_TEXT = "It's enabled!";

    /**
     * The private SelenideElement.
     */
    private SelenideElement

            checkBox = $("input[type='checkbox']"),
            addRemoveCheckBox = $("button[onclick='swapCheckbox()'"),
            verifyText = $("p[id='message']"),
            enableDisabledButton = $("button[onclick='swapInput()']"),
            inputText = $("input[type='text']");


    /**
     * Click and remove check box dynamic controls page.
     *
     * @return the dynamic controls page.
     */
    public DynamicControlsPage clickAndRemoveCheckBox() {

        checkBoxSelected();

        addRemoveCheckBox.shouldHave(Condition.enabled).click();
        verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(GONE_TEXT));
        addRemoveCheckBox.shouldHave(Condition.enabled).click();
        verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(BACK_TEXT));

        return this;
    }

    /**
     * Method check box selected.
     *
     * @return the dynamic controls page.
     */
    private DynamicControlsPage checkBoxSelected() {
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
        return this;
    }

    /**
     * Method for enable/disable input.
     *
     * @return the dynamic controls page.
     */
    public DynamicControlsPage enableDisable(String text) {

        enableDisabledButton.waitUntil(Condition.enabled, DELAY).click();
        verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(ENABLED_TEXT));
        inputText.setValue(text).pressEnter();
        inputText.shouldNotBe(Condition.enabled);

        return this;
    }


}
