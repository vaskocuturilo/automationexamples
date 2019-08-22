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
     * Method Logincred object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "loginCred")
    public static Object[][] loginCred() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!", "You logged into a secure area!"},
                {"test", "test", "Your username is invalid!"},
                {"test1", "test1", "Your username is invalid!"}
        };
    }
}
