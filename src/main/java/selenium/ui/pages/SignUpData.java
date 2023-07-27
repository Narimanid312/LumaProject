package selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.ui.helpers.ElementActions;

public class SignUpData extends BasePage {
    @FindBy(id = "firstname")
    public WebElement firstNameField;
    @FindBy(id = "lastname")
    public WebElement lastnameField;
    @FindBy(id = "email_address")
    public WebElement emailAddressField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "password-confirmation")
    public WebElement passwordConfirmField;
    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement signUpBtn;

    public SignUpData enterFirstname(String firstname) {
        elementActions.writeText(firstNameField, firstname);
        return this;
    }

    public SignUpData enterLastname(String lastname){
        elementActions.writeText(lastnameField, lastname);
        return this;
    }
    public SignUpData enterEmailAddress(String email){
        elementActions.writeText(emailAddressField, email);
        return this;
    }
    public SignUpData enterPassword(String password){
        elementActions.writeText(passwordConfirmField,password);
        return this;
    }
// public void FillUpForm(String firstname, String lastname, String email, String password, String passwordConfirm){
//  elementActions.writeText(firstNameField,faker.name().firstName())
//          .writeText(lastnameField,faker.name().lastName())
//          .writeText(emailAddressField,faker.internet().emailAddress())
//          .writeText(passwordField, faker.internet().password(8,20))
//          .writeText(passwordConfirmField, String.valueOf(passwordField));
//
//
//}
}

