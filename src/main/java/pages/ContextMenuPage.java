package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.testng.Assert.assertEquals;


/**
 * The class Context menu pages.
 */
public class ContextMenuPage {

    /**
     * private Selenide element.
     */
    private final transient SelenideElement hotSpot = $("div[id='hot-spot']");

    /**
     * The constructor.
     */
    public ContextMenuPage() {
        super();
        //empty
        return;
    }

    /**
     * Open context menu context menu pages.
     *
     * @return the context menu pages.
     */
    public ContextMenuPage openContextMenu() {

        hotSpot.contextClick();

        assertAlertText();

        return this;
    }

    /**
     * Method assertAlertText.
     *
     * @return the context menu pages.
     */
    private ContextMenuPage assertAlertText() {

        assertEquals("You selected a context menu", switchTo().alert().getText());


        return this;
    }
}
