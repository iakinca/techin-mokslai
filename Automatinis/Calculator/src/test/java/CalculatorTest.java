import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest {

    @Test
    public void testCalculator() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.enterNumber1("3");
        calculatorPage.enterMinus();
        calculatorPage.enterNumber2("2");
        calculatorPage.clickCalculate();

        assertEquals(calculatorPage.getAnswer(),"1");


    }


}
