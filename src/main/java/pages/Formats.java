package pages;


/**
 * The enum Formats.
 */
public enum Formats {

    /**
     * Bold formats.
     */
    BOLD("div[aria-label='Bold']"),

    /**
     * Italic formats.
     */
    ITALIC("div[id='mceu_4'] button");

    /**
     * The private value.
     */
    private String textFormat;

    /**
     * The constructor.
     */
    Formats(final String thisTextFormat) {
        this.textFormat = thisTextFormat;
    }

    /**
     * Getter getTextFormat.
     *
     * @return the text format
     */
    public String getTextFormat() {
        return textFormat;
    }
}
