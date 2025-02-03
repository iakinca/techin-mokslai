import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccount extends BasePage {

    @FindBy(css = ".no-account")
    private WebElement createAccount;


    public CreatAccount
            (WebDriver driver) {
        super(driver);
    }


    public void clickCreateAccountLink() {
        createAccount.click();

    }
}

