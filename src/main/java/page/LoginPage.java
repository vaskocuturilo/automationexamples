package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Login page.
 */
public class LoginPage {

    /**
     * The private Selenide Elements.
     */
    private SelenideElement loginField = $("input[id='username']"),
            passwordField = $("input[id='password']"),
            loginButton = $("button[class='radius']"),
            validationMessage = $("div[id='flash']");


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

    public LoginPage checkValidationMessage(String messageForValidation) {

        validationMessage.waitUntil(Condition.visible, 5000).shouldHave(Condition.text(messageForValidation));

        return this;
    }
}
