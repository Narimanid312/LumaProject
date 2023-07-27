package selenium.login;

import org.testng.annotations.Test;
import selenium.BaseTest;

public class LoginTests extends BaseTest {
    @Test
    void loginWithCredentials(){
        driver.get("https://demoqa.com/login");

    }
    @Test
    void loginWithInvalidName(){
        driver.get("https://demoqa.com/login");

    }  @Test
    void loginWithInvalidPassword(){
        driver.get("https://demoqa.com/login");

    }

}
