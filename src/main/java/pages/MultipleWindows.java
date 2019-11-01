package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Multiple windows.
 */
public class MultipleWindows {

    /**
     * The private Selenide Elements.
     */
    private final transient SelenideElement content = $("div[id='content']");

    /**
     * The constant NEW_WINDOW.
     */
    private static final String NEW_WINDOW = "Opening a new window";

    /**
     * The constant CLICK_HERE.
     */
    private static final String CLICK_HERE = "Click Here";

    /**
     * The default constructor.
     */
    public MultipleWindows() {
        super();
        //empty
        return;
    }

    /**
     * Method Check page multiple windows.
     *
     * @return the multiple windows
     */
    public MultipleWindows checkThatOpenMainWindow() {
        content.$("h3").shouldHave(Condition.text(NEW_WINDOW));

        return this;
    }

    /**
     * Method that open a new window.
     *
     * @return the new window
     */
    public NewWindow openNewWindow() {
        content.$("a").shouldHave(Condition.text(CLICK_HERE)).click();
        selectLastTab();

        return new NewWindow();
    }

    /**
     * Method select Last Tab. This is method for select last open tab in any browser.
     */
    private void selectLastTab() {
        for (final String lastTab : WebDriverRunner.getWebDriver().getWindowHandles()) {

            WebDriverRunner.getWebDriver().switchTo().window(lastTab);
        }
    }


}
