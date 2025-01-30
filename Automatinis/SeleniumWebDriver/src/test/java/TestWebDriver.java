import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestWebDriver {

    @Test
    void Form() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("Diana");
        driver.findElement(By.id("lastName")).sendKeys("Daigera");
        driver.findElement(By.id("userEmail")).sendKeys("diana@gmail.com");
        driver.findElement(By.cssSelector("div#genterWrapper > .col-md-9.col-sm-12 > div:nth-of-type(2) > label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("37068785245");
        driver.findElement(By.id("dateOfBirthInput")).click();

        Select birthYear = new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
        birthYear.selectByVisibleText("1989");

        Select birthMonth = new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
        birthMonth.selectByVisibleText("April");
        driver.findElement(By.cssSelector("div[role='listbox'] > div:nth-of-type(4) > div:nth-of-type(1)")).click();


        WebElement subjectsInput = driver.findElement(By.cssSelector("input#subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("div#hobbiesWrapper > .col-md-9.col-sm-12 > div:nth-of-type(1) > label")).click();


        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\D2PT\\Desktop\\images.png");

        driver.findElement(By.id("currentAddress")).sendKeys("Didlaukio g. 12-8");


        WebElement selectStateInput = driver.findElement(By.id("react-select-3-input"));
        selectStateInput.sendKeys("Haryana");
        selectStateInput.sendKeys(Keys.ENTER);

        WebElement selectCityInput = driver.findElement(By.id("react-select-4-input"));
        selectCityInput.sendKeys("Karnal");
        selectCityInput.sendKeys(Keys.ENTER);

        driver.findElement(By.id("submit")).click();
        


    }

}