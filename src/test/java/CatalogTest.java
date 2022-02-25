import org.junit.jupiter.api.Test;
import pages.Catalog;

public class CatalogTest {

    Catalog catalog = new Catalog();

    @Test
    void addToCartVerification() {
        catalog.openCatalogPage();
        catalog.pressBuyButton();
        catalog.pressToCartButton();
        catalog.verifyToCartButtonIsPressed();
    }
}
