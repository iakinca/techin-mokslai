import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    @FindBy(css = "input[name='quantity']")
    private WebElement quantity;
    @FindBy(css = "button[name='add_cart_product']")
    private WebElement addCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void clickAddCartButton() {
        addCartButton.click();
    }
    public void verifyCartCounter(int expectedCount) {
        wait.until(ExpectedConditions.textToBePresentInElement(quantity, String.valueOf(expectedCount)));
        String cartValue = quantity.getText();
        Assertions.assertEquals(String.valueOf(expectedCount), cartValue, "Incorrect");
    }
}
