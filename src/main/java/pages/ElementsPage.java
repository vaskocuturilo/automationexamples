package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Elements pages.
 */
public class ElementsPage {

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Elements.
     */
    private final transient SelenideElement
            addElementButton = $("button[onclick='addElement()']"),
            delete = $("button[onclick='deleteElement()']");


    /**
     * Default constructor.
     */
    public ElementsPage() {
        super();
        //empty
        return;
    }

    /**
     * The private method addElement.
     *
     * @return this.
     */
    private ElementsPage addElement() {
        addElementButton.click();

        return this;
    }

    /**
     * The private method deleteElement.
     *
     * @return this.
     */
    private ElementsPage deleteElement() {

        delete.waitUntil(Condition.enabled, DELAY).click();
        return this;
    }

    /**
     * Method ActionItems.
     *
     * @return the elements pages
     */
    public ElementsPage actionItems() {
        addElement();
        deleteElement();

        return this;
    }

}
