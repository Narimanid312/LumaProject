package selenium.practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.BaseTest;

public class IframeDemo extends BaseTest {

   @Test
   void test123(){
       driver.get("https://demoqa.com/frames");
       driver.switchTo().frame("frame1");
       String text = driver.findElement(By.id("sampleHeading")).getText();
       System.out.println(text);
driver.switchTo().parentFrame();

String text1 = driver.findElement(By.xpath("//div[text()='Frames']")).getText();
       System.out.println(text1);
    }
}
