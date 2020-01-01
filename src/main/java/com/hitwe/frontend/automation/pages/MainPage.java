package com.hitwe.frontend.automation.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private By mainPageLoginTitleLocator = By.cssSelector(".login-section-title");

    @Step
    public MainPage assertMainPageOpened() {
        $(mainPageLoginTitleLocator).shouldBe(Condition.visible);
        return this;
    }

}
