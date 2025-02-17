import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest extends BaseTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/products.csv", numLinesToSkip = 1)
    void catalogSearchTest(String product, String price, String discount, String size) {
        productPage.searchProduct(product);
        assertTrue(productPage.namesProducts(product));
        productPage.namesProducts(product);

    }
}
