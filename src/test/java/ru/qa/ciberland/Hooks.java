package ru.qa.ciberland;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUrl() {
        open("https://ciberland.ru/");
    }


}
