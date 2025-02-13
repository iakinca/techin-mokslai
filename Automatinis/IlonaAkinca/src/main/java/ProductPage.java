import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(id = "input-quantity")
    public WebElement inputQuantity;

    @FindBy(id = "button-cart")
    public WebElement clickButtonCart;

    @FindBy(css = ".btn-inverse")
    public WebElement buttonCart;

    @FindBy(css = "div#alert > .alert.alert-dismissible.alert-success")
    public WebElement successAlert;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void enterQuantity(String quantity) {
        inputQuantity.clear();
        inputQuantity.sendKeys(quantity);
    }
}

