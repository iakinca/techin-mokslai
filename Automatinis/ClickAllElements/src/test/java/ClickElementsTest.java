import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ClickElementsTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/D2PT/Downloads/QApraktinisALL%20(2).html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void clickTest() {
        for (int level = 1; level <= 7; level++) {
            System.out.println("Done: " + level);

            List<WebElement> icons = driver.findElements(By.className("icon"));
            if (icons.isEmpty()) {
                break;
            }

            for (int i = 0; i < icons.size(); i++) {
                icons.get(i).click();
            }

            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();
        }

    }
}

