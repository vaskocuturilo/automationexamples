package pages;

/**
 * The enum Nested frames.
 */
public enum NestedFrames {

    /**
     * Left nested frames.
     */
    LEFT("frame-left"),

    /**
     * Middle nested frames.
     */
    MIDDLE("frame-middle"),

    /**
     * Right nested frames.
     */
    RIGHT("frame-right");

    /**
     * The private value frame.
     */
    private String frame;

    /**
     * The Constructor.
     *
     * @param frameName this is value frame.
     */
    NestedFrames(final String frameName) {
        this.frame = frameName;
    }

    /**
     * Gets frame name.
     *
     * @return the frame name
     */
    public String getFrame() {
        return frame;
    }
}
