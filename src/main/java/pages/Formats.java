package pages;

public enum Formats {

    BOLD("div[aria-label='Bold']"),
    ITALIC("div[id='mceu_4'] button");

    private String textFormat;

    Formats(String textFormat) {
        this.textFormat = textFormat;
    }

    public String getTextFormat() {
        return textFormat;
    }
}
