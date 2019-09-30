package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static org.testng.Assert.assertEquals;


/**
 * The class Drag and drop pages.
 */
public class DragAndDropPage {

    /**
     * Private Selenide Elements.
     */
    private final transient SelenideElement
            rectangleOne = $("div[id='column-a']"),
            rectangleTwo = $("div[id='column-b']");

    /**
     * The constructor.
     */
    public DragAndDropPage() {
        super();
        //empty
        return;
    }

    /**
     * Method checkContextRectangles.
     *
     * @param source source.
     * @return the drag and drop pages
     */
    private DragAndDropPage checkContextRectangles(final String source) {

        assertEquals(source, rectangleOne.getText());

        return this;
    }

    /**
     * Move to elements drag and drop pages.
     *
     * @return the drag and drop pages
     */
    public DragAndDropPage moveToElements() {
        checkContextRectangles("A");

        actions().clickAndHold(rectangleOne).moveToElement(rectangleTwo).build().perform();

        return this;
    }

}
