package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.BaseTest;
import selenium.ui.helpers.DropDownHelper;

import static selenium.ui.helpers.DropDownHelper.*;

public class SelectDemo extends BaseTest {
    @Test
    void Demo() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
       selectUsingVisibleText(element, "Black");
//        Thread.sleep(2000);
//        selectUsingRandomIndex(element);
//        Thread.sleep(2000);
//        System.out.println(getDropDownAllValue(element));
        //selectRandomValue(element);
        Thread.sleep(2000);
    }
}
