package selenium.test.alertTest;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.BaseTest;
import selenium.ui.helpers.AlertHelper;


public class AlertDemoTests extends BaseTest {
    @Test
    void test1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
     //   driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper(driver);
//        Thread.sleep(2000);
//        alertHelper.acceptAlert();
        //Thread.sleep(2000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(2000);
//        alertHelper.acceptAlert();
//        Thread.sleep(2000);
//        driver.findElement(By.id("confirmButton")).click();
//        Thread.sleep(2000);
//        alertHelper.dismissAlert();
//        Thread.sleep(2000);
//        driver.findElement(By.id("promtButton")).click();
//        Thread.sleep(2000);
//        alertHelper.sendAlert("Hello World!");
//        Thread.sleep(2000);


    }
}
