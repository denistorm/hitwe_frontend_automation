package com.hitwe.frontend.automation.popups;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadPhotoPopup {

    private By addFromComputerButtonLocator = By.cssSelector(".file_form");
    private By loadingIndicatorLocator = By.cssSelector("div.loading_indicator");
    private By letsGoButtonLocator = By.cssSelector(".add-ava-go-btn");

    public UploadPhotoPopup clickAddFromComputerButton() {
        $(addFromComputerButtonLocator).click();
        return this;
    }

    public UploadPhotoPopup assertPhotoUploadingFinished() {
        $(loadingIndicatorLocator).shouldNotBe(Condition.visible);
        return this;
    }

    public UploadPhotoPopup clickLetsGoButtonButton() {
        $(letsGoButtonLocator).click();
        return this;
    }

}
