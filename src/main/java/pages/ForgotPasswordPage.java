package pages;

import com.codeborne.selenide.SelenideElement;
import com.sun.istack.internal.NotNull;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

/**
 * The type Forgot password page.
 */
public class ForgotPasswordPage {


    /**
     * The private Selenide element.
     */
    private SelenideElement

            email = $("input[id='email']");


    /**
     * Generate random email.
     *
     * @return the authorization page
     */
    @NotNull
    private static String createEmailForNewUser() {

        final String todayData = String.valueOf(new Date().getTime());

        return "hf_test" + todayData + "@qa.team";
    }

    /**
     * Enter email forgot password page.
     *
     * @return the forgot password page
     */
    public EmailSentPage enterEmail() {

        email.setValue(createEmailForNewUser()).pressEnter();

        return new EmailSentPage();
    }
}
