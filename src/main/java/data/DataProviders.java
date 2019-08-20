package data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "loginCred")
    public static Object[][] loginCred() {
        return new Object[][]{
                {"", ""},
                {"", ""},
                {"", ""}
        };
    }
}
