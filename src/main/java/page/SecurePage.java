package page;

import static com.codeborne.selenide.Selenide.$;

/**
 * The type Secure page.
 */
public class SecurePage {

    public SecurePage() {
        super();
        //empty
        return;
    }

    /**
     * Method Click logout secure page.
     *
     * @return the secure page.
     */
    public SecurePage clickLogout() {
        $("div[class='example'] a").click();

        return this;
    }
}
