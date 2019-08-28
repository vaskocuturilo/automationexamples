package com.herokuapp;

import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.*;

public class AvailableExamplesTests extends AbstractPage {

    private static final String CHECK_BASIC = "Basic Auth";

    private static final String CHECK_DIGEST = "Digest Auth";

    @Test(dataProvider = "loginCred", dataProviderClass = DataProviders.class)
    @Story("Login automation script.")
    public void testCheckAuthorization(String username, String password, String messageForValidation) {
        openPage("/login");
        new LoginPage()
                .enterValidData(username, password)
                .checkValidationMessage(messageForValidation);
    }

    @Test()
    @Story("Automation script for check images on hovers page.")
    public void testCheckImages() {
        openPage("/hovers");
        new ImagePage()
                .selectAndHoverImage(3)
                .selectAndHoverImage(3, "user1");
    }

    @Test
    @Story("Sorting data tables.")
    public void testSortTable() {
        openPage("/tables");
        new TablePage()
                .assertResult()
                .sortHeaderDescending();
    }

    @Test
    @Story("Add/Remove Elements.")
    public void testAddRemoveElements() {
        openPage("/add_remove_elements/");
        new ElementsPages()
                .actionItems();
    }

    @Test
    @Story("Basic Auth.")
    public void testBasicAuth() {
        openPage("/basic_auth", "admin", "admin");
        new DifferentAuthorization()
                .checkValidationMessages(CHECK_BASIC);
    }

    @Test
    @Story("Broken images")
    public void testBrokenImages() {
        openPage("/broken_images");
        new BrokenImages()
                .checkWhichImagesIsBroken();
    }

    @Test
    @Story("Check boxes")
    public void testChecked() {
        openPage("/checkboxes");
        new CheckboxesPage()
                .checkedOneChecked()
                .checkedTwoChecked();
    }

    @Test
    @Story("Context menu")
    public void testContextMenu() {
        openPage("/context_menu");
        new ContextMenuPage()
                .openContextMenu();
    }

    @Test
    @Story("Digest Auth")
    public void testDigestAuthentication() {
        openPage("/digest_auth", "admin", "admin");
        new DifferentAuthorization()
                .checkValidationMessages(CHECK_DIGEST);
    }

    @Test
    @Story("Drag and Drop")
    public void testDragAndDrop() {
        openPage("/drag_and_drop");
        new DragAndDropPage()
                .moveToElements();
    }

    @Test(dataProvider = "dataForSelector", dataProviderClass = DataProviders.class)
    @Story("Dropdown List")
    public void testDropdownList(String selector) {
        openPage("/dropdown");
        new DropDownPage()
                .selectText(selector);
    }

}
