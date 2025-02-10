import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPracticePage extends BasePage{

    @FindBy( id = "name")
    private WebElement fieldName;
    @FindBy (id = "email")
    private WebElement fieldEmail;
    @FindBy (css = ".form-check-input:checked[type=radio]")
    private WebElement checkGender;
    @FindBy ( id = "mobile")
    private WebElement inputMobile;

    public SeleniumPracticePage(WebDriver driver) {
        super(driver);
    }

    public void inputName(String name){
        fieldName.sendKeys(name);

    }


}
