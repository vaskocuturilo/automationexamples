package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Image page.
 */
@SuppressWarnings("PMD.LawOfDemeter")
public class ImagePage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Default constructor.
     */
    public ImagePage() {
        super();
        //empty
        return;
    }

    /**
     * Method Select and hover image page.
     *
     * @param numberImage the number image
     * @return the image page
     */
    public ImagePage selectAndHoverImage(final int numberImage) {

        $("div[id='content'] div:nth-child(" + numberImage + ") img").hover();

        return this;
    }

    /**
     * Method Select and hover image  page.
     *
     * @param numberImage the number image
     * @param nameImage   the name image
     * @return the image page
     */
    public ImagePage selectAndHoverImage(final int numberImage, final String nameImage) {

        $("div[id='content'] div:nth-child(" + numberImage + ") [class='figcaption']")
                .waitUntil(Condition.visible, DELAY)
                .shouldHave(Condition.text(nameImage));

        return this;
    }


}
