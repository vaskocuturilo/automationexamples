package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


/**
 * The class Jquery menu.
 */
public class JqueryMenu {

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "Menu";

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement

            enabled = $("a[id='ui-id-2']"),
            backToMenu = $("a[id='ui-id-5']"),
            downloads = $("a[id='ui-id-4']"),
            linkMenu = $("div[class='description'] li a");

    /**
     * The private Elements Collection.
     */
    private final transient ElementsCollection

            typeFiles = $$("ul[id='menu'] ul li:nth-child(1) li");

    /**
     * The default constructor.
     */
    public JqueryMenu() {
        super();
        //empty
        return;
    }

    /**
     * Click to menu jquery menu.
     *
     * @return the jquery menu
     */
    public JqueryMenu openMenu() {

        enabled.click();
        backToMenu.click();
        linkMenu.waitUntil(Condition.enabled, DELAY).shouldHave(Condition.text(TEXT));

        return this;
    }

    /**
     * Check content menu jquery menu.
     *
     * @return the jquery menu
     */
    public JqueryMenu checkContentMenu() {
        linkMenu.click();
        enabled.click();
        downloads.click();
        typeFiles.shouldHaveSize(3);
        typeFiles.shouldHave(CollectionCondition.textsInAnyOrder("PDF", "CSV", "EXCEL"));

        return this;
    }
}
