import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{




    @FindBy( css = "input[name='username']")
    private WebElement usernameInput;
    @FindBy ( css = "input[name='password']")
    private WebElement passwordInput;
    @FindBy( css = ".orangehrm-login-button")
    private WebElement loginButton;

    @FindBy (css = ".orangehrm-demo-credentials.oxd-sheet.oxd-sheet--gray-lighten-2.oxd-sheet--gutters.oxd-sheet--rounded > p:nth-of-type(1)")
    private WebElement textUsername;
    @FindBy(css = ".orangehrm-demo-credentials.oxd-sheet.oxd-sheet--gray-lighten-2.oxd-sheet--gutters.oxd-sheet--rounded > p:nth-of-type(2)")
    private WebElement textPassword;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUser(String username) {
        usernameInput.sendKeys(username);
    }
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUsername() {
        String text = textUsername.getText();
        String[] test = text.split(" : ");

        return test[1];
    }

    public String getPassword() {
        String text = textPassword.getText();
        String[] test = text.split(" : ");

        return test[1];
    }


}
