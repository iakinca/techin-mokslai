import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPracticePage extends BasePage {

    @FindBy(id = "name")
    private WebElement fieldName;
    @FindBy(id = "email")
    private WebElement fieldEmail;
    @FindBy(css = "div:nth-of-type(3) > .col-sm-9 > .align-center.d-flex.justify-content-start > div:nth-of-type(2) > .form-check-input.mt-0")
    private WebElement gender;
    @FindBy(id = "mobile")
    private WebElement inputMobile;
    @FindBy (id = "dob")
    private WebElement birthday;
    @FindBy (id = "subjects")
    private WebElement subjects;
    @FindBy (css = "input#hobbies")
    private WebElement clickSubject;
    @FindBy (id = "picture")
    private WebElement picture;
    @FindBy (css = "textarea")
    private WebElement textArea;
    @FindBy (id = "state")
    private WebElement stateDropdown;
    @FindBy (id = "city")
    private WebElement cityDropdown;
    @FindBy (css = ".btn.btn-primary")
    private WebElement submitButton;

    public SeleniumPracticePage(WebDriver driver) {
        super(driver);
    }

    public void inputName(String name) {
        fieldName.sendKeys(name);

    }

    public void inputEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void clickGender() {
        gender.click();
    }
    public void inputMobile(String mobile) {
        inputMobile.sendKeys(mobile);

    }
    public void enterBirthday(String birthdayDay) {
        birthday.sendKeys(birthdayDay);
    }
    public void inputSubjects(String subjectsItem) {
        subjects.sendKeys(subjectsItem);

    }
    public void enterSubject() {
        clickSubject.click();

    }
    public void inputPicture(String pictureDog) {
        picture.sendKeys(pictureDog);

    }
    public void inputAddress(String addressMap) {
        textArea.sendKeys(addressMap);
    }

    public void selectStateInput (String state) {
       Select select = new Select(stateDropdown);
       select.selectByVisibleText(state);

    }
    public void selectCityInput(String city) {
        Select select = new Select(cityDropdown);
        select.selectByVisibleText(city);
    }
    public void clickSubmitButton() {
        submitButton.click();
    }
}
