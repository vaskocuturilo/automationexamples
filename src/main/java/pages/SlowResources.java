package pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.nullValue;


/**
 * The type Slow resource.
 */
public class SlowResources extends AbstractController {

    /**
     * Constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Constant BAD_REQUEST.
     */
    private static final int BAD_REQUEST = 503;

    /**
     * The constructor.
     */
    public SlowResources() {
        super();
        //empty
        return;
    }

    /**
     * Method checkThatResourcesIsVerySlow.
     */
    public void checkThatResourcesIsVerySlow() {

        given(reqSpec).then().
                spec(resSpec).statusCode(SUCCESS).body("$", nullValue()).statusCode(BAD_REQUEST).log().ifError();
    }


    @Override
    /**
     * Abstract method.
     *
     * @return the element
     */
    protected void abstractMethod() {
    }
}
