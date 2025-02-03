import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    String firstName = "Diana";
    String lastName = "Daigera";
    String emailn = "testuser" + System.currentTimeMillis() + "@gmail.com";
    String password = "Test1234@Test";

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://192.168.90.109/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterEach
    void teardown() {
       // driver.quit();
    }
}
