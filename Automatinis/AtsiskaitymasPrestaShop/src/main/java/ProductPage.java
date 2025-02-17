import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//form/input[@type='text']")
    private WebElement inputProductName;
    @FindBy(css = "h2 > a")
    private List<WebElement> productNames;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct (String search) {
        inputProductName.sendKeys(search);
        inputProductName.sendKeys(Keys.ENTER);
    }

    public boolean namesProducts(String title) {
        return productNames.stream()
                .map(element -> element.getText().toLowerCase())
                .anyMatch(text -> text.equals(title.toLowerCase()));


    }
}

