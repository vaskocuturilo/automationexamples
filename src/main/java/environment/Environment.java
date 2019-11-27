package environment;


import java.util.Locale;

/**
 * The class Environment.
 */
public class Environment {

    /**
     * Method isCheckOperatingSystem.
     * If method return true, that is automation scripts to run on OS Unix or Linux.
     * If method return false, that is automation scripts to run on OS Windows or Mac.
     *
     * @return the boolean
     */
    public static boolean isCheckOperatingSystem() {

        final String systemName = System.getProperty("os.name").toLowerCase(Locale.ROOT);

        return (systemName.contains("nix") || systemName.contains("nux"));
    }
}
