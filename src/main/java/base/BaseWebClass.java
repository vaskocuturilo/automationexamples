package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.WebDriverRunner.*;
import static utils.Browser.selectBrowser;


/**
 * The class Base web class.
 */
public class BaseWebClass {

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(BaseWebClass.class.getName());

    public BaseWebClass() {
        super();
        //empty
        return;
    }

    /**
     * Method Start process.
     */
    @BeforeMethod(alwaysRun = true)
    public void startProcess() {
        baseUrl = "http://the-internet.herokuapp.com";
        selectBrowser("Chrome");
        clearBrowserCache();

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
