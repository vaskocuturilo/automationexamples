package pages;

public enum CheckFormats {

    BOLD("body[id='tinymce'] strong"),
    ITALIC("body[id='tinymce'] em");

    private String checkFormat;

    CheckFormats(String checkFormat) {
        this.checkFormat = checkFormat;
    }

    public String getCheckFormat() {
        return checkFormat;
    }

}
