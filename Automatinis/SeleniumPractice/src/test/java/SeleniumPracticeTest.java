import org.junit.jupiter.api.Test;

public class SeleniumPracticeTest extends BaseTest {

    @Test
    public void practiceTest() {
        SeleniumPracticePage seleniumPracticePage = new SeleniumPracticePage(driver);
        seleniumPracticePage.inputName("Audinga");
        seleniumPracticePage.inputEmail("audinga@gmail.com");
        seleniumPracticePage.clickGender();
        seleniumPracticePage.inputMobile("370658254");
        seleniumPracticePage.enterBirthday("02/02/1991");
        seleniumPracticePage.inputSubjects("Maths");
        seleniumPracticePage.enterSubject();
        seleniumPracticePage.inputPicture("C:\\Users\\D2PT\\Desktop\\download.jpg");
        seleniumPracticePage.inputAddress("Trinapolio g. 2");
        seleniumPracticePage.selectStateInput("Haryana");
        seleniumPracticePage.selectCityInput("Agra");
        seleniumPracticePage.clickSubmitButton();
    }
}
