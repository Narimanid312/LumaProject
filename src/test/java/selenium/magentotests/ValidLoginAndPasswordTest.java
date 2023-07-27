package selenium.magentotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.BaseTest;

public class ValidLoginAndPasswordTest extends BaseTest {
    @Test
    void loginToSite() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.id("email")).sendKeys("narimanid@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Kariman1!");
driver.findElement(By.xpath("//button[@id='send2']")).click();
Thread.sleep(5000);
        WebElement checker = driver.findElement(By.xpath("//span[@class='logged-in']"));
        Assert.assertTrue(checker.isDisplayed());
        Thread.sleep(5000);
    }
}
