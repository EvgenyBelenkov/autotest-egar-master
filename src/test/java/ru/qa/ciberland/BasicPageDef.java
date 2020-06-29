package ru.qa.ciberland;

import io.cucumber.java.en.Then;
import ru.qa.ciberland.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Input name product {string}")
    public void inputNameProduct(String arg0) {
        basicPage.inputSearch(arg0);
    }

    @Then("basket visible {string}")
    public void basketVisible(String arg0) {
        basicPage.basketVisible(arg0);
    }


    }

