package selenium.test.alertTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import selenium.BaseTest;

import java.security.Key;

public class BrowsersТests extends BaseTest {
    @Test
void test123() throws InterruptedException {
        driver.get("https://mbank.kg/");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@class='CbkHeader_active__yrdkK']")).click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='CbkHeader_link__bWDAB']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Credits", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='CbkTabs_item__S2L03 CbkTabs_active__mwdnY']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='SearchResultsItem_link__KXfFG']")).click();


    }
}
