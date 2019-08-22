package com.herokuapp;

import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.ImagePage;
import page.LoginPage;
import page.AbstractPage;

import static org.testng.Assert.assertEquals;

public class AvailableExamplesTests extends AbstractPage {

    @Test(dataProvider = "loginCred", dataProviderClass = DataProviders.class)
    @Story("Login automation script.")
    public void checkAuthorization(String username, String password, String messageForValidation ) {
        openPage("/login");
        assertEquals("The Internet", getTitlePage());
        new LoginPage()
                .enterValidData(username, password)
                .checkValidationMessage(messageForValidation);
    }

    @Test()
    @Story("Automation script for check images on hovers page.")
    public void checkImages() {
        openPage("/hovers");
        assertEquals("The Internet", getTitlePage());
        new ImagePage()
                .selectAndHoverImage(3)
                .selectAndHoverImage(3, "user1");


    }
}
