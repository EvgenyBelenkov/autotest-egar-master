package ru.qa.ciberland;

import io.cucumber.java.en.Then;
import ru.qa.ciberland.PageBasket;

public class PageBasketDef {
    PageBasket pageBasket = new PageBasket();

    @Then("check product name {string}")
    public void checkProductName(String text) {
        pageBasket.nameProducts(text);
    }

    @Then("click + increase by one")
    public void clickPlusIncreaseByOne() {
        pageBasket.clickPlus();
    }

    @Then("check cost product")
    public void checkCostProduct() {
         pageBasket.checkCost();
    }
}
