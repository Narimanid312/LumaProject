package selenium.magentotests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.BaseTest;

public class WhatsNewTest extends BaseTest {
    @Test
    void test123()  {
        driver.get("https://magento.softwaretestingboard.com/");


driver.findElement(By.xpath("//a[@role=\"menuitem\"]")).click();


}
}
