package selenium.magentotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.BaseTest;
import selenium.ui.helpers.ElementActions;

public class BagsFormsTest extends BaseTest {
    @Test
    void test123() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions = new Actions(driver);
        WebElement popupElement = driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span[1]"));
        actions.moveToElement(popupElement).perform();
        WebElement bagsBtn = driver.findElement(By.xpath("//a[@id='ui-id-25']"));
        ElementActions elementActions = new ElementActions();
        elementActions.clickTheButton(bagsBtn);
        WebElement listbtn = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[1]/strong[2]"));
        elementActions.clickTheButton(listbtn);
        WebElement el = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div[1]/div[1]/form/button"));
        elementActions.clickTheButton(el);
        Thread.sleep(2000);
        String result = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
        Assert.assertEquals(result,"You added Push It Messenger Bag to your shopping cart.");
    }
}
