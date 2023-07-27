package selenium.ui.modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
@Getter
@Setter
@AllArgsConstructor

public class NewUser {
   private String firstNameField;
    private String lastnameField;
    private String emailAddressField;
    private String passwordField;
    private String passwordConfirmField;
    private String createBtn;

}
