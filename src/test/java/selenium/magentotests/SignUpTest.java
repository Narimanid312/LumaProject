package selenium.magentotests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.BaseTest;
import selenium.ui.pages.SignUpData;

public class SignUpTest extends BaseTest {
    @Test
    void SignUpTesting() throws InterruptedException {
        Faker faker = new Faker();
driver.get("https://magento.softwaretestingboard.com/");

driver.findElement(By.xpath("//a[text()='Create an Account']")).click();
Thread.sleep(2000);
driver.findElement(By.id("firstname")).sendKeys("Mihail");
        Thread.sleep(2000);
driver.findElement(By.id("lastname")).sendKeys("Shubina");
driver.findElement(By.id("email_address")).sendKeys("nariman_133@mail.ru");
driver.findElement(By.id("password")).sendKeys("Nariman12!");
driver.findElement(By.id("password-confirmation")).sendKeys("Nariman12!");
driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
Thread.sleep(6000);

        WebElement congrut =driver.findElement(By.xpath("//span[text()='My Account']"));
        Assert.assertTrue(congrut.isDisplayed());
        Thread.sleep(6000);
    }
}
