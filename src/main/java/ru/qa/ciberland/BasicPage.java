package ru.qa.ciberland;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    private SelenideElement searchProducts = $(By.xpath("//input[@id='searchform-text']"));

    public void inputSearch(String text){
        this.searchProducts.val(text).pressEnter();
    }

    public void basketVisible(String text) {
        $(By.xpath("//h1[text()='"+text+"']")).shouldBe(Condition.visible);
    }

}
