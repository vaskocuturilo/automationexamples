package page;

import base.BaseWebClass;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;


public abstract class Page extends BaseWebClass {

    public void openPage(String url) {
        Selenide.open(url);

    }

    public String getTitlePage() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
