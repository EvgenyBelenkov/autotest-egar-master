package ru.qa.ciberland;

import io.cucumber.java.en.Then;
import ru.qa.ciberland.PageProduct;

public class PageProductDef {
    PageProduct pageProduct = new PageProduct();

    @Then("click add basket")
    public void clickAddBasket() {
        pageProduct.addBasket();
    }

    @Then("click go to basket {string}")
    public void clickGoToBasket(String text) {
        pageProduct.goToBasket(text);
    }


}
