package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class Catalog {

    private final String url = "https://kupalniki-nsk.ru/catalog/";

    public String getUrl() {
        return url;
    }

    public void openCatalogPage() {
        open(url);
    }

    public void pressBuyButton {
        $$("[class*='catalog-item2351326']").findBy(text("Купить")).shouldBe(visible, ofSeconds(5)).click();
    }

    public void pressToCartButton() {
        $("[id*='basket_actions']").shouldBe(visible, ofSeconds(5)).click();
    }

    public void verifyToCartButtonIsPressed() {
        $(byText("Для отправки товара в корзину укажите количество")).shouldBe(visible, ofSeconds(5));
    }
}
