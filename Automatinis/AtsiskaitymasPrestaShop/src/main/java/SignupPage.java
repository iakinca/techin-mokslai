import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    @FindBy(id = "_desktop_user_info")
    private WebElement signUpField;
    @FindBy(css = ".no-account")
    private WebElement createAccount;
    @FindBy(id = "field-id_gender-2")
    private WebElement gender;
    @FindBy(id = "field-firstname")
    private WebElement firstNameField;
    @FindBy(id = "field-lastname")
    private WebElement lastNameField;
    @FindBy(id = "field-email")
    private WebElement enterEmailField;
    @FindBy(id = "field-password")
    private WebElement passwordField;
    @FindBy(id = "field-birthday")
    private WebElement birthdayField;
    @FindBy(css = "input[name='psgdpr']")
    private WebElement termsCheckbox;
    @FindBy(css = "input[name='newsletter']")
    private WebElement newsletterCheckbox;
    @FindBy(css = "input[name='customer_privacy']")
    private WebElement customPrivacyCheckbox;
    @FindBy(css = "[data-link-action]")
    private WebElement submitCreateAccount;
    @FindBy(css = "[title] .hidden-sm-down")
    private WebElement enterAccount;
    @FindBy(css = ".hidden-sm-down.logout")
    private WebElement logout;
    @FindBy(css = ".user-info .hidden-sm-down")
    private WebElement signIn;
    @FindBy(css = "input#field-email")
    private WebElement enterEmail;
    @FindBy(css = "input#field-password")
    private WebElement enterPassword;
    @FindBy(css = "button#submit-login")
    private WebElement submitLogin;


    public SignupPage(WebDriver driver) {
        super(driver);

    }

    public void clickSignUp() {
        signUpField.click();
    }

    public void clickCreateAccount() {
        createAccount.click();

    }

    public void clickGender() {
        gender.click();
    }

    public void enterFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        enterEmailField.clear();
        enterEmailField.sendKeys(email);
    }

    public void enterPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void enterBirthdayField(String birthday) {
        birthdayField.sendKeys(birthday);
    }

    public void acceptAllTermsCheckbox() {
        termsCheckbox.click();
        newsletterCheckbox.click();
        customPrivacyCheckbox.click();
    }

    public void clickSave() {
        submitCreateAccount.click();
    }

    public String getSignUpName() {
        return enterAccount.getText().trim();
    }

    public void logoutButtonClick() {
        logout.click();

    }

    public void signInButtonClick() {
        signIn.click();
    }

    public void enterEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void inputPassword(String password) {
        enterPassword.sendKeys(password);
    }
    public void signInBtnClick() {
        submitLogin.click();
    }
}

