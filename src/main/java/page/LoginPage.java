package page;

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
            loginButton = $("button[class='radius']");


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
    public SecurePage enterValidData(final String login, final String password) {
        enterUsername(login);
        enterPassword(password);
        clickLoginButton();
        return new SecurePage();
    }
}
