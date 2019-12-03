package pages;

import base.BaseWeb;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static org.testng.Assert.assertEquals;


/**
 * Abstract class AbstractPage.
 */
@SuppressWarnings("PMD.LawOfDemeter")
public abstract class AbstractPage extends BaseWeb {


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
     * @param url          thi is url page.
     * @param currentTitle this is current title for check.
     */
    public void openPageWithTitle(final String url, final String currentTitle) {
        Selenide.open(url);
        assertEquals(currentTitle, getTitlePage());
    }

    /**
     * Method Open pages.
     *
     * @param username this is username.
     * @param password this is password.
     * @param url      the url.
     */
    public void openPage(final String url, final String username, final String password) {
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
