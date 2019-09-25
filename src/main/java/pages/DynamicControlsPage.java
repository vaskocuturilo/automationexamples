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
     * The private Selenide Element.
     */
    private final transient SelenideElement

            checkBox = $("input[type='checkbox']"),
            addRemoveCheckBox = $("button[onclick='swapCheckbox()'"),
            verifyText = $("p[id='message']"),
            motionButton = $("button[onclick='swapInput()']"),
            inputText = $("input[type='text']");


    /**
     * Constructor.
     */
    public DynamicControlsPage() {
        super();
        //empty
        return;
    }

    /**
     * Click and remove check box dynamic controls page.
     *
     * @return the dynamic controls page.
     */
    public DynamicControlsPage clickAndRemoveCheckBox() {
        checkBoxSelected();

        addRemoveCheckBox(GONE_TEXT);

        addRemoveCheckBox(BACK_TEXT);

        return this;
    }

    /**
     * Method add remove check box.
     *
     * @param text this is text for verify.
     */
    private void addRemoveCheckBox(final String text) {

        addRemoveCheckBox.shouldHave(Condition.enabled).click();
        verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(text));
    }

    /**
     * Method check box selected.
     */
    private void checkBoxSelected() {
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
    }

    /**
     * Method for enable/disable input.
     *
     * @param text thi is text.
     * @return the dynamic controls page.
     */
    public DynamicControlsPage enableDisable(final String text) {

        motionButton.waitUntil(Condition.enabled, DELAY).click();
        verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(ENABLED_TEXT));
        inputText.setValue(text).pressEnter();
        inputText.shouldNotBe(Condition.enabled);

        return this;
    }


}
