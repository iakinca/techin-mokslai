import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    void orangeLogin() {

        LoginPage loginPage = new LoginPage(driver);

        String username = loginPage.getUsername();
        System.out.println(loginPage.getUsername());
        loginPage.enterUser(username);

        String password = loginPage.getPassword();
        System.out.println(loginPage.getPassword());
        loginPage.enterPassword(password);

        loginPage.clickLoginButton();

        assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", driver.getCurrentUrl());


    }


}
