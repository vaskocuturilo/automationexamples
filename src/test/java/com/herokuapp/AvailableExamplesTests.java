package com.herokuapp;

import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.LoginPage;
import page.Page;

public class AvailableExamplesTests extends Page {

    @Test(dataProvider = "loginCred", dataProviderClass = DataProviders.class)
    @Story("Login automation script")
    public void test(String username, String password) {
        openPage("/login");
        new LoginPage()
                .enterValidData(username, password)
                .clickLogout();
    }
}
