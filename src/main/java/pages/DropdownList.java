package pages;

/**
 * The enum Dropdown list.
 */
public enum DropdownList {

    /**
     * Enum value Option 1.
     */
    OPTION_ONE("Option 1"),

    /**
     * Enum value Option 2.
     */
    OPTION_TWO("Option 2");


    /**
     * The private value dropDown type of String.
     */
    private String dropDown;


    /**
     * Constructor.
     *
     * @param dropDownList this is value dropDown.
     */
    DropdownList(final String dropDownList) {
        this.dropDown = dropDownList;
    }


    /**
     * Getter.
     *
     * @return dropDown.
     */
    public String getDropDown() {
        return dropDown;
    }
}
