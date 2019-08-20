package com.herokuapp;

import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.LoginPage;
import page.AbstractPage;

import static org.testng.Assert.assertEquals;

public class AvailableExamplesTests extends AbstractPage {

    @Test(dataProvider = "loginCred", dataProviderClass = DataProviders.class)
    @Story("Login automation script")
    public void test(String username, String password) {
        openPage("/login");
        assertEquals("The Internet", getTitlePage());
        new LoginPage()
                .enterValidData(username, password)
                .clickLogout();
    }
}
