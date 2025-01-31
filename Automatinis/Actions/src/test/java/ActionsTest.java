import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class ActionsTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Actions/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void dragDrop() {
        WebElement dragButton = driver.findElement(By.id("draggable"));
        WebElement dropBox = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragButton, dropBox).perform();

    }

    @Test
    void doubleClick() {
        WebElement doubleClickButton = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
    }

    @Test
    void hoverClick() {
        WebElement hoverButton = driver.findElement(By.cssSelector("#div-hover div:nth-child(1)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverButton).perform();

    }

    @Test
    void click() {
        WebElement clickButton = driver.findElement(By.id("click-box"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickButton).perform();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

}
