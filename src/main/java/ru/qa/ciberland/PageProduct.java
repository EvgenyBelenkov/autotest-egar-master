package ru.qa.ciberland;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PageProduct {

    public void addBasket() {
        $(By.cssSelector("#w5-pjax")).click();
    }

    public void goToBasket(String text) {
        $(By.xpath("//a[text()='"+text+"']")).click();
    }


}
