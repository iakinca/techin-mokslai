import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ButtonsTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void webElement() {
        driver.findElement(By.id("button1")).click();

    }

    @Test
    void javaScriptClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.id("button2"));
        js.executeScript("arguments[0].click();", button);

    }

    @Test
    void actionMoveClick() {
        Actions actions = new Actions(driver);
        WebElement button3 = driver.findElement(By.id("button3"));
        actions.moveToElement(button3).click().perform();
//        actions.click(button3).perform();

    }
}




