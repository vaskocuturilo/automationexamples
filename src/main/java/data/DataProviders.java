package data;

import org.testng.annotations.DataProvider;


/**
 * The class DataProviders.
 */
public final class DataProviders {


    /**
     * Default constructor..
     */
    private DataProviders() {
    }

    /**
     * Login cred object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "loginCred")
    public static Object[][] loginCred() {
        return new Object[][]{
                {"", ""},
                {"", ""},
                {"", ""}
        };
    }
}
