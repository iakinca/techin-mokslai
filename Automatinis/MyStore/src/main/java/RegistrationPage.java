import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id = "field-id_gender-2")
    private WebElement gender;
    @FindBy(id = "field-firstname")
    private WebElement firstname;
    @FindBy(id = "field-lastname")
    private WebElement lastname;
    @FindBy(id = "field-email")
    private WebElement email;
    @FindBy(id = "field-password")
    private WebElement password;
    @FindBy(id = "field-birthday")
    private WebElement birthday;
    @FindBy(css = "input[name='psgdpr']")
    private WebElement checkBox1;
    @FindBy(css = "input[name='customer_privacy']")
    private WebElement checkBox2;
    @FindBy(css = ".btn.btn-primary.float-xs-right.form-control-submit")
    private WebElement saveButton;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickGender() {
        gender.click();
    }

    public void inputFirstname() {
        firstname.sendKeys("Diana");
    }

    public void inputLastname() {
        lastname.sendKeys("Daigera");
    }

    public void inputEmail(String emailn) {
        email.sendKeys(emailn);
    }

    public void inputPassword(String passsword) {
        password.sendKeys(passsword);
    }

    public void inputBirthday() {
        birthday.sendKeys("04/16/1989");
    }
    public void clickCheckbox1() {
        checkBox1.click();
    }
    public void clickCheckbox2() {
        checkBox2.click();
    }
    public void clickSubmit() {
        saveButton.click();
    }
}
