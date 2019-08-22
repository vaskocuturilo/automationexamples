package page;

import base.BaseWebClass;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;


/**
 * Abstract class AbstractPage.
 */
@SuppressWarnings("PMD.LawOfDemeter")
public abstract class AbstractPage extends BaseWebClass {


    /**
     * Default constructor.
     */
    public AbstractPage() {
        super();
        //empty
        return;
    }

    /**
     * Method Open page.
     *
     * @param url the url
     */
    public void openPage(final String url) {
        Selenide.open(url);

    }

    /**
     * Method GetTitlePage.
     *
     * @return the title page
     */
    public String getTitlePage() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
