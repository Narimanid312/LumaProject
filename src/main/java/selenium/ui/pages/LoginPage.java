package selenium.ui.pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "userName")
    public WebElement usernameField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "login")
    public WebElement loginBtn;
    @FindBy(id = "//p[@id=\"name\"] ")
    public WebElement errorMessage;

    public LoginPage enterUsername(String username) {
        elementActions.writeText(usernameField, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        elementActions.writeText(passwordField, password);
        return this;
    }

    public LoginPage clickLoginBtn() {
        elementActions.clickTheButton(loginBtn);
        return this;
    }

}

