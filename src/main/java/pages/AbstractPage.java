package pages;

import base.BaseWebClass;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static org.testng.Assert.assertEquals;


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
     * Method Open pages.
     *
     * @param url the url
     */
    public void openPage(final String url) {
        Selenide.open(url);
        assertEquals("The Internet", getTitlePage());

    }

    /**
     * Method Open pages.
     *
     * @param url the url
     */
    public void openPage(final String url, String username, String password) {
        Selenide.open(url, "", username, password);
        assertEquals("The Internet", getTitlePage());

    }


    /**
     * Method GetTitlePage.
     *
     * @return the title pages
     */
    public String getTitlePage() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
