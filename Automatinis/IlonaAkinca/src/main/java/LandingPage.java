import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class LandingPage extends BasePage {

    @FindBy(css = "li:nth-of-type(8) > .dropdown-toggle.nav-link")
    public WebElement mp3Icon;
    @FindBy(css = ".dropdown:nth-of-type(8) .see-all")
    public WebElement mp3SeeAll;


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void clickMP3Icon() {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        wait.until(ExpectedConditions.elementToBeClickable(mp3Icon)).click();
        wait.until(ExpectedConditions.visibilityOf(mp3SeeAll));
        mp3SeeAll.click();


    }
}

