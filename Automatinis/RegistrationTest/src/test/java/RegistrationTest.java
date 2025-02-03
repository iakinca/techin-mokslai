import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest {
    WebDriver driver;
    String firstName = "Diana";
    String lastName = "Daigera";
    String email = "testuser" + System.currentTimeMillis() + "@gmail.com";
    String password = "Test1234@Test";


    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://192.168.88.182/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void testRegistration() {


        driver.findElement(By.id("_desktop_user_info")).click();
        driver.findElement(By.cssSelector(".no-account")).click();

        driver.findElement(By.id("field-id_gender-2")).click();
        driver.findElement(By.id("field-firstname")).sendKeys("Diana");
        driver.findElement(By.id("field-lastname")).sendKeys("Daigera");

        String email = "testuser" + System.currentTimeMillis() + "@gmail.com";
        System.out.println(email);
        driver.findElement(By.id("field-email")).sendKeys(email);

        driver.findElement(By.id("field-password")).sendKeys("Test1234@Test");
        driver.findElement(By.id("field-birthday")).sendKeys("04/16/1989");

        driver.findElement(By.cssSelector("input[name='psgdpr']")).click();
        driver.findElement(By.cssSelector("input[name='customer_privacy']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary.float-xs-right.form-control-submit")).click();

        String name = driver.findElement(By.cssSelector("[title] .hidden-sm-down")).getText();
        assertEquals("Diana Daigera", name);
        driver.findElement(By.id("_desktop_user_info")).click();


        driver.findElement(By.id("_desktop_user_info")).click();
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys("Test1234@Test");
        driver.findElement(By.id("submit-login")).click();

        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.id("identity-link")).click();

        String firstName = driver.findElement(By.id("field-firstname")).getDomAttribute("value");
        String lastName = driver.findElement(By.id("field-lastname")).getDomAttribute("value");
        String actualEmail = driver.findElement(By.cssSelector("#field-email")).getDomAttribute("value");
        assertEquals("Diana", firstName);
        assertEquals("Daigera", lastName);
        assertEquals(email, actualEmail);


    }

    @Test
    void formRegistration() {
        driver.findElement(By.id("_desktop_user_info")).click();
        driver.findElement(By.cssSelector("div#content > .no-account")).click();

        driver.findElement(By.id("field-firstname")).sendKeys("");
        driver.findElement(By.id("field-lastname")).sendKeys("");
        driver.findElement(By.id("field-email")).sendKeys("");
        driver.findElement(By.id("field-password")).sendKeys("");
        driver.findElement(By.id("field-birthday")).sendKeys("");
        driver.findElement(By.cssSelector("input[name='psgdpr']")).click();
        driver.findElement(By.cssSelector("input[name='customer_privacy']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary.float-xs-right.form-control-submit")).click();

        assertEquals("http://192.168.88.182/registration", driver.getCurrentUrl());

    }

    @Test
    void faleEmail() {
        driver.get("http://192.168.88.182/registration");
        driver.findElement(By.id("field-firstname")).sendKeys("Vardas");
        driver.findElement(By.id("field-lastname")).sendKeys("Pavardenis");
        driver.findElement(By.id("field-email")).sendKeys("testmail@");
        driver.findElement(By.id("field-birthday")).sendKeys("0/11/1989");
        driver.findElement(By.cssSelector("input[name='psgdpr']")).click();
        driver.findElement(By.cssSelector("input[name='customer_privacy']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary.float-xs-right.form-control-submit")).click();
        assertEquals("http://192.168.88.182/registration", driver.getCurrentUrl());


    }

    @AfterEach
    void tearDown() {

        driver.quit();
    }
}


