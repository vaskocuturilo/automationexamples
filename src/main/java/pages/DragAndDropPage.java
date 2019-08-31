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
    private SelenideElement

            rectangleOne = $("div[id='column-a']"),
            rectangleTwo = $("div[id='column-b']");


    /**
     * Method checkContextRectangles.
     *
     * @param source source.
     * @param target target.
     * @return the drag and drop pages
     */
    private DragAndDropPage checkContextRectangles(String source, String target) {

        assertEquals(source, rectangleOne.getText());

        return this;
    }

    /**
     * Move to elements drag and drop pages.
     *
     * @return the drag and drop pages
     */
    public DragAndDropPage moveToElements() {
        checkContextRectangles("A", "B");

        actions().clickAndHold(rectangleOne).moveToElement(rectangleTwo).build().perform();

        return this;
    }

}
