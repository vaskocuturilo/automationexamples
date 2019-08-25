package com.herokuapp;

import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.*;

import static org.testng.Assert.assertEquals;

public class AvailableExamplesTests extends AbstractPage {

    @Test(dataProvider = "loginCred", dataProviderClass = DataProviders.class)
    @Story("Login automation script.")
    public void checkAuthorization(String username, String password, String messageForValidation) {
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

    @Test
    @Story("Sorting data tables.")
    public void sortTable() {
        openPage("/tables");
        assertEquals("The Internet", getTitlePage());
        new TablePage()
                .assertResult()
                .sortHeaderDescending();
    }

    @Test
    @Story("Add/Remove Elements.")
    public void addRemoveElements() {
        openPage("/add_remove_elements/");
        assertEquals("The Internet", getTitlePage());
        new ElementsPages()
                .actionItems();
    }

    @Test
    @Story("Basic Auth.")
    public void basicAuth() {
        openPage("/basic_auth", "admin", "admin");
        assertEquals("The Internet", getTitlePage());
        new BasicAuth()
                .checkValidationMessages();
    }

    @Test
    @Story("Broken images")
    public void brokenImages(){
        openPage("/broken_images");
        assertEquals("The Internet", getTitlePage());
        new BrokenImages()
                .checkWhichImagesIsBroken();

    }
}
