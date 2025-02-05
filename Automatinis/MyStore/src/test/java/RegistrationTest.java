import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest {

    @Test
    void testLogin() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogin();

        CreatAccount creatAccount = new CreatAccount(driver);
        creatAccount.clickCreateAccountLink();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickGender();
        registrationPage.inputFirstname();
        registrationPage.inputLastname();
        registrationPage.inputEmail(emailn);
        registrationPage.inputPassword("Test1234@Test");
        registrationPage.inputBirthday();
        registrationPage.clickCheckbox1();
        registrationPage.clickCheckbox2();
        registrationPage.clickSubmit();

        OwnAccount ownAccount = new OwnAccount(driver);
        assertEquals("Diana Daigera", ownAccount.getUsername());
        ownAccount.signOut();

        SigninPage signinPage = new SigninPage(driver);
        signinPage.clickSignin();
        signinPage.enterEmail(emailn);
        signinPage.enterPassword("Test1234@Test");
        signinPage.clickLogin();

        InformationPage informationPage = new InformationPage(driver);
        informationPage.clickSignIn2();
        informationPage.clickIdentityLink();
        assertEquals("Diana",informationPage.getUserFirstName());
        assertEquals("Daigera",informationPage.getUserLastName());
        assertEquals(emailn

                ,informationPage.getUserEmail());
    }
}
