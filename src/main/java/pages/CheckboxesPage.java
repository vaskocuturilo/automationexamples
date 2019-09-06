package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Checkboxes pages.
 */
public class CheckboxesPage {

    /**
     * private Selenide Elements.
     */
    private final transient SelenideElement
            checkedOne = $("form[id='checkboxes'] input:nth-child(1)"),
            checkedTwo = $("form[id='checkboxes'] input:nth-child(3)");

    /**
     * The constructor.
     */
    public CheckboxesPage() {
        super();
        //empty
        return;
    }
    /**
     * Checked one checked checkboxes pages.
     *
     * @return the checkboxes pages
     */
    public CheckboxesPage checkedOneChecked() {
        checkedOne.click();

        return this;
    }

    /**
     * Checked two checked checkboxes pages.
     *
     * @return the checkboxes pages
     */
    public CheckboxesPage checkedTwoChecked() {
        if (!checkedTwo.isSelected()) {
            checkedTwo.click();
        }

        return this;
    }
}
