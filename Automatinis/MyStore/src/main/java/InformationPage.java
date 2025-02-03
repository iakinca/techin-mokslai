import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage {

    @FindBy(css = "[title] .hidden-sm-down")
    private WebElement signIn2;
    @FindBy(id = "identity-link")
    private WebElement identityLink;
    @FindBy(id = "field-firstname")
    private WebElement userFirstName;
    @FindBy(id = "field-lastname")
    private WebElement userLastName;
    @FindBy(id = "field-email")
    private WebElement userEmail;


    public InformationPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn2() {
        signIn2.click();
    }

    public void clickIdentityLink() {
        identityLink.click();
    }

    public String getUserFirstName() {
        return userFirstName.getDomAttribute("value");

    }
    public String getUserLastName() {
        return userLastName.getDomAttribute("value");
    }
    public String getUserEmail() {
        return userEmail.getDomAttribute("value");
    }
}
