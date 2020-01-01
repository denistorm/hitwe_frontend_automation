package com.hitwe.frontend.automation.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.hitwe.frontend.automation.pages.LandingPage;
import com.hitwe.frontend.automation.pages.Pages;
import com.hitwe.frontend.automation.popups.Popups;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.*;


public class SignUpTest {

    @BeforeTest
    @Parameters({"browserName"})
    public void setUp(String browserName) {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        BrowsersConfig.setup(browserName, Given.HITWE_LANDING_PAGE_URL);
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
        Given.deleteGeneratedPhotoFromComputer();
    }

    @AfterClass
    void deleteUser() {
        // delete created test user
        Pages.userProfilePage()
                .clickSettingsItemOfMainMenu()
                .clickDeleteProfileItemOfSubmenu()
                .clickRemoveButton()
                .clickCheckboxWithDeletingProfileForever()
                .clickCheckboxWithDataWillBeLost()
                .clickCheckboxWithMessagesAndContactsWillBeLost()
                .clickCheckboxWithProfileImpossibleToRestore()
                .clickContinueButton();
        Pages.mainPage()
                .assertMainPageOpened();
        Selenide.closeWebDriver();
        Given.deleteGeneratedPhotoFromComputer();
    }

    @Test
    public void testMaleSignUpFromLandingWithCorrectCredentials() {
        String generatedNewUserName = RandomStringUtils.randomAlphabetic(8).toLowerCase();
        String generatedNewUserEmail = RandomStringUtils.randomAlphabetic(10).toLowerCase() + "@testmail.com";

        Pages.landingPage()
                .clickLadiesButton()
                .clickDarkHairButton()
                .clickDarkEyesButton()
                .clickCurvyStatureButton()
                .enterUserName(generatedNewUserName)
                .enterUserEmail(generatedNewUserEmail)
                .clickWhoAreYouDropDownList()
                .clickWhoAreYouDropDownListWith(LandingPage.MALE)
                .clickAgeDropDownList()
                .clickAgeOfDropDownListWith("18 years")
                .clickSignUpForFreeButton();
        Popups.downloadAppFromStoresPopup()
                .clickClosePopupButton();
        Pages.userProfilePage()
                .assertUserProfilePageOpened()
                .assertUserIsCreatedWithEnteredName(generatedNewUserName);
    }

    @Test
    public void testUploadPhotoForProfileFromComputer() throws Exception {
        Pages.userProfilePage()
                .clickAvatarWithoutUserPhoto();
        Popups.uploadPhotoPopup()
                .clickAddFromComputerButton();
        Given.generateAndSaveLocallyRandomPhoto();
        Given.uploadGeneratedPhotoFromComputer();
        Popups.uploadPhotoPopup()
                .assertPhotoUploadingFinished()
                .clickLetsGoButtonButton();
        Selenide.refresh();
        Pages.userProfilePage()
                .assertAvatarContainsUserPhoto();
    }

}