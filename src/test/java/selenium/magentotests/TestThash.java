package selenium.magentotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.BaseTest;
import selenium.ui.helpers.ElementActions;

public class TestThash extends BaseTest {
    @Test
    void test23(){
        driver.get("https://magento.softwaretestingboard.com/gear/bags.html");
       WebElement trashbox = driver.findElement(By.xpath("//a[@class='action showcart']"));
        ElementActions elementActions = new ElementActions();
        elementActions.clickTheButton(trashbox);

    }
}
