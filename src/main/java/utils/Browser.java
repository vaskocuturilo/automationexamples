package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * The type Select browser.
 */
public final class Browser {

    /**
     * Default constructor..
     */

    private static final int TIME_OUT = 10;

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

        if ("Chrome".equals(browser)) {

            WebDriverManager.chromedriver().version("76.0.3809.68").setup();
            Configuration.browser = "Chrome";
            Configuration.timeout = TIME_OUT;

        }
    }
}
