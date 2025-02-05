import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ToDoListPage extends BasePage {
    @FindBy(css = "input")
    private WebElement inputField;
    @FindBy(css = "ul > li:nth-of-type(4)")
    private WebElement newInputField;


    public ToDoListPage(WebDriver driver) {
        super(driver);
    }

    public void inputList(String text) {
        inputField.sendKeys(text);
        inputField.sendKeys(Keys.ENTER);
    }
public String getNewInputFieldText() {
        return newInputField.getText();
}

    }






