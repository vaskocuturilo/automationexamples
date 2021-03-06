package browser;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * The class Select browser.
 */
@SuppressWarnings("PMD.LawOfDemeter")
public final class Browser {

    /**
     * Default constructor..
     */

    private static final int TIME_OUT = 10;

    /**
     * Constant value BROWSER SIZE.
     */
    private static final String BROWSER_SIZE = "1340x768";

    /**
     * Default constructor..
     */
    private Browser() {
    }

    /**
     * Gets browser.
     *
     * @param browser the browser
     */
    public static void selectBrowser(final String browser) {
        Configuration.browserSize = BROWSER_SIZE;
        if ("Chrome".equals(browser)) {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = Chrome.class.getName();
            Configuration.timeout = TIME_OUT;
        } else if ("Firefox".equals(browser)) {
            WebDriverManager.firefoxdriver().setup();
            Configuration.browser = Firefox.class.getName();
            Configuration.timeout = TIME_OUT;
        } else if ("Edge".equals(browser)) {
            WebDriverManager.edgedriver().setup();
            Configuration.browser = "Edge";
            Configuration.timeout = TIME_OUT;
        } else if ("Remote".equalsIgnoreCase(browser)) {
            Configuration.browser = Remote.class.getName();
        } else {
            throw new IllegalStateException("Browser " + browser + " not supported in this test");
        }
    }
}
