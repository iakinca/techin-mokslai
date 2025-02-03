import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(id = "_desktop_user_info")
    private WebElement buttonSignIn;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public void clickLogin() {
        buttonSignIn.click();
    }
}

