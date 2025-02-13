import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage {

    @FindBy(css = "div#search > input[name='search']")
    private WebElement inputSearch;

    @FindBy(css = "div#search > .btn.btn-lg.btn-light")
    private WebElement buttonSearch;

    @FindBy (css = "button#button-list")
    private WebElement buttonList;


    public CatalogPage(WebDriver driver) {
        super(driver);
    }

public void clickSearch() {
        buttonSearch.click();

}

public void clickList() {
        buttonList.click();
}

}







