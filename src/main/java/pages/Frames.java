package pages;


/**
 * The enum Frames.
 */
public enum Frames {

    /**
     * Nested frames frames.
     */
    NESTED_FRAMES("/nested_frames"),

    /**
     * Frame frames.
     */
    I_FRAME("/iframe");

    /**
     * The private value frame.
     */
    private String frame;

    /**
     * The constructor.
     *
     * @param selectFrame this is private value frame.
     */
    Frames(final String selectFrame) {
        this.frame = selectFrame;
    }

    /**
     * Gets select frame.
     *
     * @return the select frame
     */
    public String getFrame() {
        return frame;
    }
}
