package pages;


/**
 * The enum Check formats.
 */
public enum CheckFormats {

    /**
     * Bold check formats.
     */
    BOLD("body[id='tinymce'] strong"),

    /**
     * Italic check formats.
     */
    ITALIC("body[id='tinymce'] em");

    /**
     * The private value checkFormat.
     */
    private String checkFormat;

    /**
     * Default constructor.
     */
    CheckFormats(String thisCheckFormat) {
        this.checkFormat = thisCheckFormat;
    }

    /**
     * Getter getCheckFormat.
     *
     * @return the check format
     */
    public String getCheckFormat() {
        return checkFormat;
    }

}
