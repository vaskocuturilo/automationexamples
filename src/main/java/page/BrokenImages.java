package page;

import base.BaseWebClass;
import com.codeborne.selenide.SelenideElement;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$$;


/**
 * The class Broken images.
 */
public class BrokenImages {

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(BaseWebClass.class.getName());


    /**
     * Default constructor.
     */
    public BrokenImages() {
        super();
        //empty
        return;
    }

    /**
     * Method checkWhichImagesIsBroken.
     */
    public BrokenImages checkWhichImagesIsBroken() {
        for (final SelenideElement totalImages : $$("div[class='example'] img")) {
            isImageBroken(totalImages);
        }
        return this;
    }


    /**
     * Method isImageBroken.
     */
    private void isImageBroken(final SelenideElement inputImages) {
        if (inputImages.getAttribute("naturalWidth").equals("0")) {
            LOG.info("This image " + inputImages.getAttribute("outerHTML") + " is broken.");
        }
    }
}