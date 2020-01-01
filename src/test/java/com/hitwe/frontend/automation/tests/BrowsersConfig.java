package com.hitwe.frontend.automation.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;


public class BrowsersConfig {

    @Step
    public static void setup(String browserName, String URL) {
        if (browserName.equals("chrome")) {
            Configuration.browser = "chrome";
            Selenide.open(URL);
        } else if (browserName.equals("firefox")) {
            Configuration.browser = "firefox";
            Selenide.open(URL);
        }
    }

}
