package selenium.ui.drivers;
import org.openqa.selenium.WebDriver;
import selenium.ui.config.ConfigReader;
public class Driver {
    private void Driver() {
    }
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null)
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                case "opera":
                    driver = OperaWebDriver.loadOperaWebDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        return driver;
    }
    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing driver");
        }
    }
}
