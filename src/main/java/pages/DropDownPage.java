package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Drop down pages.
 */
public class DropDownPage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * private Selenide Elements.
     */
    private final transient SelenideElement selector = $("select[id='dropdown']");

    /**
     * The constructor.
     */
    public DropDownPage() {
        super();
        //empty
        return;
    }


    /**
     * Method select from drop down.
     *
     * @param dropdownList select form drop down list.
     * @return the drop down page.
     */
    public DropDownPage selectFromDropDown(final DropdownList dropdownList) {
        selectFromListByName(dropdownList);

        return this;
    }

    /**
     * Method select from list by name.
     *
     * @param dropdownList select form drop down list.
     */
    private void selectFromListByName(final DropdownList dropdownList) {
        $(selector).waitUntil(Condition.visible, DELAY).click();
        $(selector).selectOptionContainingText(dropdownList.getDropDown());
    }
}
