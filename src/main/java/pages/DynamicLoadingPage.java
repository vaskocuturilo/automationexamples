package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Dynamic loading page.
 */
public class DynamicLoadingPage {

    /**
     * The constant VERIFY_TEXT.
     */
    private static final String VERIFY_TEXT = "Hello World!";

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 10000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement exampleOne = $("div[id='content'] a:nth-child(5)"),
            exampleTwo = $("div[id='content'] a:nth-child(8)"),
            startButton = $("div[id='start'] button"),
            textFinish = $("div[id='finish']");


    /**
     * The constructor.
     */
    public DynamicLoadingPage() {
        super();
        //empty
        return;
    }

    /**
     * Check that element is hidden dynamic loading page.
     *
     * @return the dynamic loading page
     */
    public DynamicLoadingPage checkElement() {
        loadedRenderElement(exampleOne);
        WebDriverRunner.getWebDriver().navigate().back();
        loadedRenderElement(exampleTwo);

        return this;
    }

    /**
     * Check that element is hidden dynamic loading page.
     *
     * @param link this is selenide element for click.
     */
    private void loadedRenderElement(final SelenideElement link) {
        link.click();
        startButton.click();
        textFinish.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(VERIFY_TEXT));
        startButton.shouldNotBe(Condition.visible);
    }
}
