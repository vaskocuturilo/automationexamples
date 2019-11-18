package base;

import browser.Chrome;
import com.codeborne.selenide.Configuration;
import environment.Environment;
import listener.AllureScreenShooter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.logging.Logger;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.WebDriverRunner.*;
import static browser.Browser.selectBrowser;


/**
 * The class Base web class.
 */
@Listeners(AllureScreenShooter.class)
public class BaseWebClass {

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(BaseWebClass.class.getName());

    /**
     * Default constructor.
     */
    public BaseWebClass() {
        super();
        //empty
        return;
    }

    /**
     * Method Start process.
     */
    @BeforeTest(alwaysRun = true)
    public void startProcess() {
        baseUrl = "http://the-internet.herokuapp.com";
        if (Environment.isCheckOperationSystem()) {
            Configuration.browser = Chrome.class.getName();
        } else {
            selectBrowser("Chrome");
            clearBrowserCache();
        }
    }

    /**
     * Method stop.
     */
    @AfterTest(alwaysRun = true)
    public void stop() {
        LOG.info("Method start");
        closeWebDriver();
        LOG.info("Method stop");
    }
}
