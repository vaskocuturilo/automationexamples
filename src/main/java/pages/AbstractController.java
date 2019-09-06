package pages;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;


/**
 * The type Abstract controller.
 */
public abstract class AbstractController {

    /**
     * Constant TIME.
     */
    private static final long TIME = 55000L;


    /**
     * The Request reqSpec.
     * Check Content type(Must be JSON),
     * return log detail(ALL).
     */
    protected static RequestSpecification reqSpec = new RequestSpecBuilder()
            .setContentType("text/html;charset=utf-8")
            .setBaseUri("http://the-internet.herokuapp.com/")
            .setBasePath("slow")
            .log(LogDetail.ALL)
            .build();


    /**
     * The Response reqSpec.
     * Check Content type(Must be JSON),
     * Check response time (Must be less 15 sec.).
     */
    protected static ResponseSpecification resSpec = new ResponseSpecBuilder()
            .expectContentType("text/html;charset=utf-8")
            .expectResponseTime(Matchers.lessThan(TIME)).build();

    /**
     * Default constructor.
     */
    public AbstractController() {
        super();
        //empty
        return;
    }

    /**
     * Abstract method.
     */
    protected abstract void abstractMethod();
}
