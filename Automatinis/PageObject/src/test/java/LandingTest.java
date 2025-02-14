import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingTest extends BaseTest {

    @Test
    public void testCart() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.chooseGreenDuck();

        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddCartButton();
        productPage.verifyCartCounter(1);
    }


    public void acceptCookies() {
        List<WebElement> cookiePopup = driver.findElements(By.cssSelector("button[name='accept_cookies']"));
        cookiePopup.get(0).click();
    }

}




