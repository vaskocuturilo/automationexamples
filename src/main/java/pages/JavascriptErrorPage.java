package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Javascript error page.
 */
public class JavascriptErrorPage {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "This page has a JavaScript error in the onload event. This is often a problem to using normal Javascript injection techniques.";

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(JavascriptErrorPage.class.getName());

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement content = $("p");

    /**
     * Check that page javascript error page.
     *
     * @return the javascript error page
     */
    public JavascriptErrorPage checkTextOnPageAndGetErrors() {

        content.shouldHave(Condition.text(TEXT));
        getConsoleErrors();

        return this;
    }

    /**
     * The private method getConsoleErrors.
     */
    private void getConsoleErrors() {
        Logs logs = WebDriverRunner.getWebDriver().manage().logs();
        LogEntries logEntries = logs.get(LogType.BROWSER);
        List<LogEntry> errorLogs = logEntries.filter(Level.ALL);
        if (errorLogs.size() != 0) {
            for (LogEntry logEntry : logEntries) {
                LOG.info("Found error in logs: " + logEntry.getMessage());
            }
        }
    }

}
