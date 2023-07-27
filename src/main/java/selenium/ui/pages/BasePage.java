package selenium.ui.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;
import selenium.ui.drivers.Driver;
import selenium.ui.helpers.ElementActions;

public abstract class BasePage {
    Faker faker = new Faker();
public BasePage(){
    PageFactory.initElements(Driver.getDriver(),this);
    }
    public ElementActions elementActions = new ElementActions();
}
