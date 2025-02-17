import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignupTest extends BaseTest {
    @Test
    public void testSignup() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.clickSignUp();
        signupPage.clickCreateAccount();
        signupPage.clickGender();
        signupPage.enterFirstNameField("Diana");
        signupPage.enterLastNameField("Dinaviciute");

        String uniqueEmail = "testuser" + System.currentTimeMillis() + "@gmail.com";
        signupPage.inputEmail(uniqueEmail);

        signupPage.enterPasswordField("Strongpassword123!");
        signupPage.enterBirthdayField("04/16/1989");
        signupPage.acceptAllTermsCheckbox();
        signupPage.clickSave();

        assertEquals("Diana Dinaviciute", signupPage.getSignUpName());

        signupPage.logoutButtonClick();

        signupPage.signInButtonClick();
        signupPage.enterEmail(uniqueEmail);
        signupPage.inputPassword("Strongpassword123!");
        signupPage.signInBtnClick();


    }

}
