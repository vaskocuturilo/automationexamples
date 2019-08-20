package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends Page {

    private SelenideElement loginField = $("input[id='username']"),
            passwordField = $("input[id='password']"),
            loginButton = $("button[class='radius']");


    private LoginPage enterUsername(String username) {
        loginField.setValue(username);

        return this;
    }

    private LoginPage enterPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    private LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public SecurePage enterValidData(String login, String password) {
        enterUsername(login);
        enterPassword(password);
        clickLoginButton();
        return new SecurePage();
    }
}
