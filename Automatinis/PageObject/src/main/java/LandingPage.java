import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LandingPage extends BasePage {

    @FindBy(css = "section#box-popular-products a[title='Green Duck']")
    private WebElement greenDuck;
    @FindBy(css = "button[name='accept_cookies']")
    private WebElement cookies;


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void chooseGreenDuck() {
        greenDuck.click();
    }


}







