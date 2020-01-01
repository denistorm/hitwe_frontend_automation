package com.hitwe.frontend.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage {

    private By ladiesButtonLocator = By.cssSelector("#slide-01 > div > div.inter-select-item.left > a");
    private By menButtonLocator = By.cssSelector("#slide-01 > div > div.inter-select-item.right > a");
    private By darkHairColorButtonLocator = By.cssSelector("#slide-02-f > div > div.inter-select-item.left > a");
    private By darkEyesColorButtonLocator = By.cssSelector("#slide-03-f > div > div.inter-select-item.left > a");
    private By curvyStatureButtonLocator = By.cssSelector("#slide-04-f > div > div.inter-select-item.right > a");
    private By yourNameInputFieldLocator = By.cssSelector("div.land-form-row:nth-child(5) > input:nth-child(1)");
    private By yourEmailInputFieldLocator = By.cssSelector("div.land-form-row:nth-child(6) > input:nth-child(1)");
    private By whoAreYouDropDownListLocator = By.cssSelector("div.form-col:nth-child(1) > select:nth-child(1)");
    private By maleGenderOfWhoAreYouDropDownListLocator = By.cssSelector("div.form-col:nth-child(1) > select:nth-child(1) > option:nth-child(2)");
    private By femaleGenderOfWhoAreYouDropDownListLocator = By.cssSelector("div.form-col:nth-child(1) > select:nth-child(1) > option:nth-child(3)");
    private By ageDropDownListLocator = By.cssSelector("div.form-col:nth-child(2) > select:nth-child(1)");
    private By eighteenYearsOfAgeDropDownListLocator = By.cssSelector("div.form-col:nth-child(2) > select:nth-child(1) > option:nth-child(2)");
    private By signUpForFreeButtonLocator = By.cssSelector(".land-btn-submit");

    public LandingPage clickLadiesButton() {
        $(ladiesButtonLocator).click();
        return this;
    }

    public LandingPage clickMenButton() {
        $(menButtonLocator).click();
        return this;
    }

    public LandingPage clickDarkHairButton() {
        $(darkHairColorButtonLocator).click();
        return this;
    }

    public LandingPage clickDarkEyesButton() {
        $(darkEyesColorButtonLocator).click();
        return this;
    }

    public LandingPage clickCurvyStatureButton() {
        $(curvyStatureButtonLocator).click();
        return this;
    }

    public LandingPage enterUserName(String userName) {
        $(yourNameInputFieldLocator).setValue(userName);
        return this;
    }

    public LandingPage enterUserEmail(String userEmail) {
        $(yourEmailInputFieldLocator).setValue(userEmail);
        return this;
    }

    public LandingPage clickWhoAreYouDropDownList() {
        $(whoAreYouDropDownListLocator).click();
        return this;
    }

    public LandingPage clickMaleGenderOfWhoAreYouDropDownList() {
        $(maleGenderOfWhoAreYouDropDownListLocator).click();
        return this;
    }

    public LandingPage clickFemaleGenderOfWhoAreYouDropDownList() {
        $(femaleGenderOfWhoAreYouDropDownListLocator).click();
        return this;
    }

    public LandingPage clickAgeDropDownList() {
        $(ageDropDownListLocator).click();
        return this;
    }

    public LandingPage clickEighteenYearsFromOfDropDownList() {
        $(eighteenYearsOfAgeDropDownListLocator).click();
        return this;
    }

    public LandingPage clickSignUpForFreeButton() {
        $(signUpForFreeButtonLocator).click();
        return this;
    }

}
