import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnAccount extends BasePage {

    @FindBy(css = "[title] .hidden-sm-down")
    private WebElement ownAccount;
    @FindBy(id = "_desktop_user_info")
    private WebElement signOutButton;


    public OwnAccount(WebDriver driver) {
        super(driver);

    }

    public String getUsername() {
        return ownAccount.getText();
    }

    public void signOut() {
        signOutButton.click();
    }

}
