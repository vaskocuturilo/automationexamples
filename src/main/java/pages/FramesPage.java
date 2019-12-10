package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * The class Frames page.
 */
public class FramesPage {

    /**
     * The constant FRAME_TOP.
     */
    private static final String FRAME_TOP = "frame-top";

    /**
     * The constant FRAME_BOTTOM.
     */
    private static final String FRAME_BOTTOM = "frame-bottom";

    /**
     * The constant I_FRAME.
     */
    private static final String I_FRAME = "mce_0_ifr";

    /**
     * The private SelenideElement.
     */
    private static transient SelenideElement addText = $("body[id='tinymce']");

    /**
     * The default constructor.
     */
    public FramesPage() {
        super();
        //empty
        return;
    }

    /**
     * Select type of frame frames page.
     *
     * @param frames the frames
     * @return the frames page
     */
    public FramesPage selectTypeOfFrame(final Frames frames) {

        $("a[href='" + frames.getFrame() + "']").click();

        return this;
    }

    /**
     * Select frame from top frames page.
     *
     * @param nestedFrames the nested frames
     * @param textInside   the text inside
     * @return the frames page
     */
    public FramesPage selectFrameFromTop(final NestedFrames nestedFrames, final String textInside) {
        switchTo().frame(FRAME_TOP);
        switchTo().frame(nestedFrames.getFrame());
        $("body").shouldHave(Condition.text(textInside));
        switchTo().defaultContent();
        return this;
    }

    /**
     * Select frame from bottom frames page.
     *
     * @param textInside the text inside
     * @return the frames page
     */
    public FramesPage selectFrameFromBottom(final String textInside) {
        switchTo().frame(FRAME_BOTTOM);
        $("body").shouldHave(Condition.text(textInside));
        switchTo().defaultContent();
        WebDriverRunner.getWebDriver().navigate().back();
        return this;
    }

    /**
     * Select i frame frames page.
     *
     * @param textInside the text inside
     * @return the frames page
     */
    public FramesPage selectIFrame(final String textInside) {

        switchTo().frame(I_FRAME);
        addText.setValue(textInside);
        checkThatTextIsCorrect(textInside);

        return this;
    }

    /**
     * Check that text is correct frames page.
     *
     * @param textInside the text inside
     * @return the frames page
     */
    public FramesPage checkThatTextIsCorrect(final String textInside) {
        addText.shouldHave(Condition.text(textInside));

        return this;
    }


}
