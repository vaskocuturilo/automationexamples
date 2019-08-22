package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Login page.
 */
@SuppressWarnings({"PMD.LawOfDemeter", "PMD.ImmutableField", "PMD.BeanMembersShouldSerialize"})

public class LoginPage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Elements.
     */
    private SelenideElement loginField = $("input[id='username']"),
            passwordField = $("input[id='password']"),
            loginButton = $("button[class='radius']"),
            validationMessage = $("div[id='flash']");

    /**
     * Default constructor.
     */
    public LoginPage() {
        super();
        //empty
        return;
    }

    /**
     * Method userName.
     *
     * @param username user name;
     * @return this.
     */
    private LoginPage enterUsername(final String username) {
        loginField.setValue(username);

        return this;
    }

    /**
     * Method enterPassword.
     *
     * @param password password.
     * @return this.
     */
    private LoginPage enterPassword(final String password) {
        passwordField.setValue(password);
        return this;
    }

    /**
     * Method clickLoginButton.
     *
     * @return this.
     */
    private LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    /**
     * Method Enter valid data secure page.
     *
     * @param login    login.
     * @param password the password.
     * @return the secure page.
     */
    public LoginPage enterValidData(final String login, final String password) {
        enterUsername(login);
        enterPassword(password);
        clickLoginButton();
        return this;
    }


    /**
     * Method checkValidationMessage.
     *
     * @param validMessage validation message.
     * @return the secure page.
     */
    public LoginPage checkValidationMessage(final String validMessage) {

        validationMessage.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(validMessage));

        return this;
    }
}
