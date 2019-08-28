package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.testng.Assert.assertEquals;


/**
 * The class Context menu page.
 */
public class ContextMenuPage {


    /**
     * private Selenide element.
     */
    private SelenideElement hotSpot = $("div[id='hot-spot']");

    /**
     * Open context menu context menu page.
     *
     * @return the context menu page.
     */
    public ContextMenuPage openContextMenu() {

        hotSpot.contextClick();

        assertAlertText();

        return this;
    }

    /**
     * Method assertAlertText.
     *
     * @return the context menu page.
     */
    private ContextMenuPage assertAlertText() {

        assertEquals("You selected a context menu", switchTo().alert().getText());


        return this;
    }
}
