import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage {

    @FindBy(id = "_desktop_user_info")
    private WebElement signIn;
    @FindBy(id = "field-email")
    private WebElement email;
    @FindBy(id = "field-password")
    private WebElement password;
    @FindBy(id = "submit-login")
    private WebElement login;


    public SigninPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignin() {
        signIn.click();

    }

    public void enterEmail(String emailn) {
        email.sendKeys(emailn);
    }

    public void enterPassword(String passsword) {
        password.sendKeys(passsword);

    }

    public void clickLogin() {
        login.click();

    }
}
