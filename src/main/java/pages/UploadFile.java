package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class UploadFile.
 */
public class UploadFile {

    /**
     * The private selenide element.
     */
    private SelenideElement uploadFile = $("input[id='file-upload']");

    /**
     * Default constructor.
     */
    public UploadFile() {
        super();
        //empty
        return;
    }

    /**
     * Check upload file upload file.
     *
     * @param fileForUpload thi is file for upload on the page.
     * @return the upload file
     */
    public UploadFile checkUploadFile(final File fileForUpload) {
        uploadFile.uploadFile(fileForUpload);

        return this;
    }
}
