package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Checkboxes page.
 */
public class CheckboxesPage {


    /**
     * private Selenide Elements.
     */
    private SelenideElement
            checkedOne = $("form[id='checkboxes'] input:nth-child(1)"),
            checkedTwo = $("form[id='checkboxes'] input:nth-child(3)");

    /**
     * Checked one checked checkboxes page.
     *
     * @return the checkboxes page
     */
    public CheckboxesPage checkedOneChecked() {
        checkedOne.click();

        return this;
    }

    /**
     * Checked two checked checkboxes page.
     *
     * @return the checkboxes page
     */
    public CheckboxesPage checkedTwoChecked() {
        if (!checkedTwo.isSelected()) {
            checkedTwo.click();
        }

        return this;
    }
}
