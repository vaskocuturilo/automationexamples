package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;


/**
 * The type Exit intent.
 */
public class ExitIntent {

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement close = $("div[id='ouibounce-modal'] div[class='modal-footer'] p");

    /**
     * The default constructor.
     */
    public ExitIntent() {
        super();
        //empty
        return;
    }

    /**
     * Mouse move exit intent.
     *
     * @return the exit intent
     */
    public ExitIntent moveMouseOutViewportPanel() {
        actions().moveByOffset(1, 1).click().perform();

        close.click();

        return this;
    }

}
