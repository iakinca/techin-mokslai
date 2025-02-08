import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage extends BasePage {

    @FindBy(id = "number1")
    private WebElement number1;
    @FindBy(id = "number2")
    private WebElement number2;
    @FindBy(id = "calculate")
    private WebElement calculate;
    @FindBy(id = "answer")
    private WebElement answer;

    public CalculatorPage(WebDriver driver) {
        super(driver);

    }

    public void enterNumber1(String number) {
        number1.sendKeys(number);

    }

    public void enterMinus() {
        Select dropdownOptions = new Select(driver.findElement(By.id("function")));
        dropdownOptions.selectByValue("minus");
    }
    public void enterNumber2(String number) {
        number2.sendKeys(number);
    }
    public void clickCalculate() {
        calculate.click();
    }
    public String getAnswer() {
        return answer.getText();
    }
}
