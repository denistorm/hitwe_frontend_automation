package com.hitwe.frontend.automation.popups;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DownloadAppFromStoresPopup {

    private By closePopupButtonLocator = By.cssSelector("html body.body-wrapper div.interstial-wrap div.interstial-main-box a.interstial-close");

    public DownloadAppFromStoresPopup clickClosePopupButton() {
        $(closePopupButtonLocator).click();
        return this;
    }
}
