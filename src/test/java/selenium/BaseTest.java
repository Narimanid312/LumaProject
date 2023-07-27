package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenium.ui.drivers.Driver;


public abstract class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
