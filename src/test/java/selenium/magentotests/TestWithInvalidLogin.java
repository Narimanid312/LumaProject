package selenium.magentotests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.BaseTest;

public class TestWithInvalidLogin extends BaseTest {
    @Test
    void InvalidLogin() throws InterruptedException {

            driver.get("https://magento.softwaretestingboard.com/");
            driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
            driver.findElement(By.id("email")).sendKeys("narimanid@gmail.ckm");
            driver.findElement(By.id("pass")).sendKeys("Kariman1!");
            driver.findElement(By.xpath("//button[@id='send2']")).click();
            Thread.sleep(2000);
            String errorMassage = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
            String error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
            Thread.sleep(2000);
            Assert.assertEquals(error,errorMassage);
            Thread.sleep(2000);
    }
}
