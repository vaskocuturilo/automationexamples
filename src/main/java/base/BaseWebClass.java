package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static utils.SelectBrowser.getBrowser;

public class BaseWebClass {


    @BeforeMethod(alwaysRun = true)
    public void startProcess() {
        baseUrl = "http://the-internet.herokuapp.com";
        getBrowser("Chrome");

    }


    @AfterTest(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();

    }

}
