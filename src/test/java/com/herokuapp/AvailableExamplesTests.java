package com.herokuapp;

import data.DataProviders;
import io.qameta.allure.Story;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.*;

import java.io.File;

public class AvailableExamplesTests extends AbstractPage {

    private static final String CHECK_BASIC = "Basic Auth";

    private static final String CHECK_DIGEST = "Digest Auth";

    private final File fileForUpload = new File("src/main/resources/uploadFile.png");

    private static final String TEST = "test";


    @Test(dataProvider = "loginCred", dataProviderClass = DataProviders.class)
    @Story("Login automation script.")
    public void testCheckAuthorization(String username, String password, String messageForValidation) {
        openPage("/login");
        new LoginPage()
                .enterValidData(username, password)
                .checkValidationMessage(messageForValidation);
    }

    @Test()
    @Story("Automation script for check images on hovers pages.")
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
        new ElementsPage()
                .actionItems();
    }

    @Test
    @Story("Basic Auth.")
    public void testBasicAuth() {
        openPage("/basic_auth", "admin", "admin");
        new DifferentAuthorizationPage()
                .checkValidationMessages(CHECK_BASIC);
    }

    @Test
    @Story("Broken images.")
    public void testBrokenImages() {
        openPage("/broken_images");
        new BrokenImages()
                .checkWhichImagesIsBroken();
    }

    @Test
    @Story("Check boxes.")
    public void testChecked() {
        openPage("/checkboxes");
        new CheckboxesPage()
                .checkedOneChecked()
                .checkedTwoChecked();
    }

    @Test
    @Story("Context menu.")
    public void testContextMenu() {
        openPage("/context_menu");
        new ContextMenuPage()
                .openContextMenu();
    }

    @Test
    @Story("Digest Auth.")
    public void testDigestAuthentication() {
        openPage("/digest_auth", "admin", "admin");
        new DifferentAuthorizationPage()
                .checkValidationMessages(CHECK_DIGEST);
    }

    @Test
    @Story("Drag and Drop.")
    public void testDragAndDrop() {
        openPage("/drag_and_drop");
        new DragAndDropPage()
                .moveToElements();
    }

    @Test()
    @Story("Dropdown List.")
    public void testDropdownList() {
        openPage("/dropdown");
        new DropDownPage()
                .selectFromDropDown(DropdownList.OPTION_TWO);
    }

    @Test
    @Story("Entry Ad.")
    public void testEntryAd() {
        openPage("/entry_ad");
        new ModalWindowPage()
                .assertAndCloseModalWindow();
    }

    @Test
    @Story("Forgot Password.")
    public void testForgotPassword() {
        openPage("/forgot_password");
        new ForgotPasswordPage()
                .enterEmail()
                .confirmationSent();
    }

    @Test
    @Story("JavaScript alerts.")
    public void testJSAlerts() {
        openPage("/javascript_alerts");
        new AlertsPage()
                .javaScriptAlerts()
                .javaScriptConfirm()
                .javaScriptPrompt()
                .confirmationResult();
    }

    @Test
    @Story("Key Presses.")
    public void testKeyPresses() {
        openPage("/key_presses");
        new KeyPressesPage()
                .useKeyButton(Keys.ESCAPE);
    }

    @Test
    @Story("Redirection.")
    public void testRedirection() {
        openPage("/redirector");
        new RedirectionPage()
                .usingRedirection();
    }

    @Test
    @Story("Slow Resources.")
    public void testSlowResources() {
        new SlowResources()
                .checkThatResourcesIsVerySlow();
    }

    @Test
    @Story("Status Codes.")
    public void testStatusCode() {
        openPage("/status_codes");
        new StatusCodePage()
                .checkStatusCodeContent();
    }

    @Test
    @Story("Upload file.")
    public void testUploadFile() {
        openPage("/upload");
        new UploadFile()
                .checkUploadFile(fileForUpload);
    }

    @Test
    @Story("Disappearing elements.")
    public void testDisappearingElements() {
        openPage("/disappearing_elements");
        new DisappearingElementsPage()
                .assertPagesAfterTransition();
    }

    @Test
    @Story("Dynamic Controls.")
    public void testDynamicControls() {
        openPage("/dynamic_controls");
        new DynamicControlsPage()
                .clickAndRemoveCheckBox()
                .enableDisable(TEST);
    }

    @Test
    @Story("Dynamically Loaded Page Elements.")
    public void testDynamicallyLoadedPageElements() {
        openPage("/dynamic_loading");
        new DynamicLoadingPage()
                .checkElement();
    }

    @Test
    @Story("Exit Intent.")
    public void testExitIntent() {
        openPage("/exit_intent");
        new ExitIntent()
                .moveMouseOutViewportPanel();
    }

    @Test
    @Story("Notification Message.")
    public void testNotificationMessage() {
        openPage("/notification_message_rendered");
        new NotificationMessage()
                .checkNotificationMessage();
    }

    @Test
    @Story("Inputs.")
    public void testInputs() {
        openPage("/inputs");
        new InputsPage()
                .addNumber("100");
    }

    @Test
    @Story("JQuery Menu.")
    public void testJQueryMenu() {
        openPage("/jqueryui/menu#");
        new JqueryMenu()
                .openMenu()
                .checkContentMenu();
    }

    @Test
    @Story("Horizontal Slider.")
    public void testHorizontalSlider() {
        openPage("/horizontal_slider");
        new HorizontalSliderPage()
                .moveSlider(30);
    }

    @Test
    @Story("Multiple Windows.")
    public void testMultipleWindows() {
        openPage("/windows");
        new MultipleWindows()
                .checkThatOpenMainWindow()
                .openNewWindow()
                .checkThatOpenNewWindow();
    }

    @Test
    @Story("Javascript Error.")
    public void testJavascriptError() {
        openPageWithTitle("/javascript_error", "Page with JavaScript errors on load");
        new JavascriptErrorPage()
                .checkTextOnPageAndGetErrors();
    }

    @Test
    @Story("Frames.")
    public void testFrames() {
        openPage("/frames");
        new FramesPage()
                .selectTypeOfFrame(Frames.NESTED_FRAMES)
                .selectFrameFromTop(NestedFrames.MIDDLE, "middle")
                .selectFrameFromBottom("Bottom")
                .selectTypeOfFrame(Frames.I_FRAME)
                .selectIFrame("Hello world");
    }

    @Test
    @Story("Tiny Mce")
    public void testTinyMce() {
        openPage("/tinymce");
        new TinyMcePage()
                .addTextInField("Hello world")
                .switchTextFormat(Formats.BOLD)
                .checkFormatText(CheckFormats.BOLD);
    }
}
