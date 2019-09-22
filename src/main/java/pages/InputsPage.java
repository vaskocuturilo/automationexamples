package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Inputs page.
 */
public class InputsPage {

    /**
     * The private Selenide Elements.
     */
    private final transient SelenideElement number = $("div[id='content'] input");

    /**
     * Instantiates a new Inputs page.
     */
    public InputsPage() {
        super();
        //empty
        return;
    }

    /**
     * Method Set Number.
     *
     * @param inputNumber the input number.
     */
    public InputsPage addNumber(final String inputNumber) {

        number.setValue(inputNumber).pressEnter();

        return this;
    }
}
