import org.junit.jupiter.api.Test;

public class AddToCartTest extends BaseTest{

    @Test
    public void testAds() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickMP3Icon();
    }
}
