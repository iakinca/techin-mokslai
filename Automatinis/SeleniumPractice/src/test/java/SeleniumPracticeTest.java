import org.junit.jupiter.api.Test;

public class SeleniumPracticeTest extends BaseTest {

    @Test
    public void practiceTest() {
        SeleniumPracticePage seleniumPracticePage = new SeleniumPracticePage(driver);
        seleniumPracticePage.inputName("Audinga");
    }
}
