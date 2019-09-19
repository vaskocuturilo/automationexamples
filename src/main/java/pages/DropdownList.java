package pages;

/**
 * The enum Dropdown list.
 */
public enum DropdownList {

    /**
     * Enum value Option 1.
     */
    OptionOne("Option 1"),

    /**
     * Enum value Option 2.
     */
    OptionTwo("Option 2");


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
