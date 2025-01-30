import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void javaScriptAlert() {
        driver.findElement(By.id("button1")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    void javaScriptConfirm() {
        driver.findElement(By.id("button4")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement resultText = driver.findElement(By.id("confirm-alert-text"));
        String actualText = resultText.getText();
        Assertions.assertEquals("You pressed OK!", actualText);

    }

    @Test
    void modalPop() {
        driver.findElement(By.id("button2")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modalTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-title")));
        String actualText = modalTitle.getText();
        Assertions.assertEquals("It’s that Easy!! Well I think it is.....", actualText);
        driver.findElement(By.cssSelector(".modal-footer [data-dismiss]")).click();

    }

    @Test
    void modalPop2() {
        driver.findElement(By.id("button3")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement loader = driver.findElement(By.id("loader"));
        wait.until(ExpectedConditions.visibilityOf(loader));

        driver.findElement(By.id("button1")).click();
        WebElement waitModelTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-title")));
        String actualText = waitModelTitle.getText();
        Assertions.assertEquals("Well Done For Waiting....!!!", actualText);
        driver.findElement(By.cssSelector(".modal-footer [data-dismiss]")).click();

    }
    @AfterEach
    void Teardown() {
        driver.quit();
    }
}
