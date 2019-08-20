package page;

import base.BaseWebClass;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;


/**
 * The type AbstractPage.
 */
public abstract class AbstractPage extends BaseWebClass {


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
