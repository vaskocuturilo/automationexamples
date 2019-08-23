package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Elements pages.
 */
public class ElementsPages {

    /**
     * The private Selenide Elements.
     */
    private SelenideElement
            addElementButton = $("button[onclick='addElement()']"),
            deleteElementButton = $("button[onclick='deleteElement()']");


    /**
     * Default constructor.
     */
    public ElementsPages() {
        super();
        //empty
        return;
    }

    /**
     * The private method addElement.
     */
    private ElementsPages addElement() {
        addElementButton.click();

        return this;
    }

    /**
     * The private method deleteElement.
     */
    private ElementsPages deleteElement() {

        deleteElementButton.waitUntil(Condition.enabled, 5000).click();
        return this;
    }

    /**
     * Method ActionItems.
     *
     * @return the elements pages
     */
    public ElementsPages actionItems() {
        addElement();
        deleteElement();

        return this;
    }

}
