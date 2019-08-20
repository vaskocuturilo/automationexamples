package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBrowser {

    public static void getBrowser(String browser) {

        if ("Chrome".equals(browser)) {

            WebDriverManager.chromedriver().version("76.0.3809.68").setup();
            Configuration.browser = "Chrome";
            Configuration.timeout = 10;

        }
    }
}
