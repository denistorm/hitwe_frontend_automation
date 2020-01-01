package com.hitwe.frontend.automation.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserProfilePage {

    private By mainMenuLocator = By.cssSelector(".act-panel");
    private By userNameLocator = By.cssSelector(".act-panel-user-name");
    private By avatarWithNoImageLocator = By.cssSelector(".prof_add_avatar");
    private By settingsItemOfMainMenuLocator = By.cssSelector("a.act-main-menu-item:nth-child(12)");
    private By deleteProfileItemOfSubmenuLocator = By.cssSelector("a.main-tile-submenu-item:nth-child(5)");
    private By removeButtonLocator = By.cssSelector("#btn-hide");
    private By checkboxDeletingProfileForeverLocator  = By.cssSelector("#form-delete > div:nth-child(1) > label > input");
    private By checkboxDataWillBeLostLocator  = By.cssSelector("#form-delete > div:nth-child(2) > label > input");
    private By checkboxMessagesAndContactsWillBeLostLocator  = By.cssSelector("#form-delete > div:nth-child(3) > label > input");
    private By checkboxProfileImpossibleToRestoreLocator  = By.cssSelector("#form-delete > div:nth-child(4) > label > input");
    private By continueButtonLocator  = By.cssSelector(".submit-delete-form");


    @Step
    public UserProfilePage assertUserProfilePageOpened() {
        $(mainMenuLocator).shouldBe(Condition.visible);
        return this;
    }

    @Step
    public UserProfilePage assertUserIsCreatedWithEnteredName(String userName) {
        $(userNameLocator).shouldBe(Condition.text(userName));
        return this;
    }

    @Step
    public UserProfilePage clickAvatarWithoutUserPhoto() {
        $(avatarWithNoImageLocator).click();
        return this;
    }

    @Step
    public UserProfilePage assertAvatarContainsUserPhoto() {
        $(avatarWithNoImageLocator).shouldNotBe(Condition.visible);
        return this;
    }

    @Step
    public UserProfilePage clickSettingsItemOfMainMenu() {
        $(settingsItemOfMainMenuLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickDeleteProfileItemOfSubmenu() {
        $(deleteProfileItemOfSubmenuLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickRemoveButton() {
        $(removeButtonLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickCheckboxWithDeletingProfileForever() {
        $(checkboxDeletingProfileForeverLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickCheckboxWithDataWillBeLost() {
        $(checkboxDataWillBeLostLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickCheckboxWithMessagesAndContactsWillBeLost() {
        $(checkboxMessagesAndContactsWillBeLostLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickCheckboxWithProfileImpossibleToRestore() {
        $(checkboxProfileImpossibleToRestoreLocator).click();
        return this;
    }

    @Step
    public UserProfilePage clickContinueButton() {
        $(continueButtonLocator).click();
        return this;
    }

}
