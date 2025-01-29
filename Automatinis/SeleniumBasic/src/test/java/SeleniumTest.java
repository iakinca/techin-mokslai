import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    private WebDriver driver;


    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://192.168.91.195/");
        driver.manage().window().maximize();
    }

    @Test
    public void openWishlist() throws InterruptedException {
        driver.findElement(By.id("wishlist-total")).click();

        List<WebElement> searchBoxes = driver.findElements(By.xpath("//input[@type='search']"));
        System.out.println(searchBoxes.size());

        driver.findElement(By.id("input-email")).sendKeys("email@email.com");
        Thread.sleep(3000);
        driver.findElement(By.id("input-email")).clear();


        driver.findElements(By.cssSelector(".btn-primary")).get(1).click();

        driver.findElements(By.cssSelector(".btn-primary")).get(0).click();
        assertEquals("http://192.168.91.195/en-gb?route=account/register", driver.getCurrentUrl());

        driver.findElement(By.id("input-firstname")).sendKeys("firstname");
        driver.findElement(By.id("input-lastname")).sendKeys("lastname");
        driver.findElement(By.id("input-email")).sendKeys("email@email.com");
        driver.findElement(By.id("input-password")).sendKeys("password123");
        System.out.println(driver.findElement(By.id("input-password")).isEnabled());

        assertTrue(driver.findElement(By.cssSelector(".btn.btn-block.btn-inverse.btn-lg.dropdown-toggle")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector(".btn.btn-block.btn-lg.dropdown-toggle")).isDisplayed());

        driver.findElement(By.cssSelector("input[name='agree']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        driver.findElement(By.cssSelector("li:nth-of-type(1) > .dropdown-toggle.nav-link")).click();
        driver.findElement(By.cssSelector(".dropdown-menu.show > .see-all")).click();

//        driver.findElement(By.cssSelector("select#input-limit > option[value='http://192.168.91.195/en-gb/catalog/desktops?limit=25']")).click();
        WebElement inputLimit = driver.findElement(By.id("input-limit"));
        Select selectLimit = new Select(inputLimit);
        selectLimit.selectByIndex(1);
        inputLimit = driver.findElement(By.id("input-limit"));
        selectLimit = new Select(inputLimit);
        System.out.println(selectLimit.getFirstSelectedOption().getText());

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void Test2() throws InterruptedException {
        driver.findElement(By.cssSelector("div#search > input[name='search']")).sendKeys("Maxbook");
        driver.findElement(By.cssSelector("div#search > .btn.btn-lg.btn-light")).click();
        Thread.sleep(3000);
        //driver.findElement(By.id("#button-search")).isDisplayed();

        driver.findElement(By.cssSelector("div#search > input[name='search']")).clear();

        driver.findElement(By.cssSelector("div#search > input[name='search']")).sendKeys("Macbook");
        driver.findElement(By.cssSelector("div#search > .btn.btn-lg.btn-light")).click();
        Thread.sleep(3000);

        List<WebElement> searchItems = driver.findElements(By.cssSelector("div.col.mb-3"));
        System.out.println(searchItems.size());
        Thread.sleep(3000);

        Select sortBy = new Select(driver.findElement(By.cssSelector("select#input-sort")));
        sortBy.selectByVisibleText("Price (Low > High)");

        sortBy = new Select(driver.findElement(By.cssSelector("select#input-sort")));
        System.out.println(sortBy.getFirstSelectedOption().getText());
        Thread.sleep(3000);

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}





