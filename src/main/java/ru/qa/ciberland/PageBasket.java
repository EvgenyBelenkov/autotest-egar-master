package ru.qa.ciberland;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PageBasket {

    public void nameProducts(String text) {
        $(By.xpath("//*[text()='"+ text +"']")).shouldBe(Condition.visible);
    }
    public void clickPlus() {
        $(By.xpath("//a[@class='btn btn-primary'][contains(text(),'+')]")).click();
        $(By.xpath("//input[@id='cartform-quantity']")).shouldBe(Condition.visible);
    }

    public void checkCost() {
        $(By.xpath("//body//tbody//td[4]")).shouldBe(Condition.visible);
    }
}
