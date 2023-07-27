package selenium.ui.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class OperaWebDriver {
    public static WebDriver loadOperaWebDriver(){
        WebDriverManager.operadriver().setup();
        WebDriver driver= (WebDriver) new OperaWebDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
return driver;
    }

}
