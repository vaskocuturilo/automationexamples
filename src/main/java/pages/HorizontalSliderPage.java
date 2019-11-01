package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

/**
 * The class Horizontal slider page.
 */
public class HorizontalSliderPage {

    /**
     * The constant Y_OFFSET.
     */
    private static final int Y_OFFSET = 0;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement slider = $("div[class='sliderContainer'] input");

    /**
     * The default constructor.
     */
    public HorizontalSliderPage() {
        super();
        //empty
        return;
    }

    /**
     * Move slider horizontal slider page.
     *
     * @param stepSlider this is value for step in slider.
     * @return the horizontal slider page.
     */
    public HorizontalSliderPage moveSlider(final int stepSlider) {
        actions().moveToElement(slider, xOffset(stepSlider), Y_OFFSET).click().build().perform();
        return this;
    }

    /**
     * Method xOffset.
     *
     * @param stepSlider this is value for step in slider.
     * @return int value for xOffset for function moveToElement.
     */
    private int xOffset(final int stepSlider) {
        return slider.getSize().width * stepSlider / 100;
    }
}

