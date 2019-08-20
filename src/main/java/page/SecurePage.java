package page;

import static com.codeborne.selenide.Selenide.$;

public class SecurePage {

    public SecurePage clickLogout() {
        $("div[class='example'] a").click();

        return this;
    }
}
