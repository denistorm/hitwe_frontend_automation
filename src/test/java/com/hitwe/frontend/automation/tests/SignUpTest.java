package com.hitwe.frontend.automation.tests;

import com.codeborne.selenide.Selenide;
import com.hitwe.frontend.automation.pages.Pages;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.*;


public class SignUpTest {

    @BeforeTest
    @Parameters({"browserName"})
    public void setUp(String browserName) { BrowsersConfig.setup(browserName, Given.HITWE_LANDING_PAGE_URL);
    }

//    @BeforeClass
//    public void setUp() {
//        Configuration.browser = "firefox";
//        Selenide.open("https://m.hitwe.com/landing/inter?p=15276");
//    }

//    @AfterClass
//    void deleteUser() {
//        // delete created test user
//        Pages.userProfilePage()
//                .clickSettingsItemOfMainMenu()
//                .clickDeleteProfileItemOfSubmenu()
//                .clickRemoveButton()
//                .clickCheckboxWithDeletingProfileForever()
//                .clickCheckboxWithDataWillBeLost()
//                .clickCheckboxWithMessagesAndContactsWillBeLost()
//                .clickCheckboxWithProfileImpossibleToRestore()
//                .clickContinueButton();
//        Pages.mainPage()
//                .assertMainPageOpened();
//        Selenide.closeWebDriver();
//        Given.deleteGeneratedPhotoFromComputer();
//    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
        Given.deleteGeneratedPhotoFromComputer();
    }

    @Test
    public void testSignUpFromLandingPageWithCorrectCredentials() {
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
                .clickMaleGenderOfWhoAreYouDropDownList()
                .clickAgeDropDownList()
                .clickEighteenYearsFromOfDropDownList();
//                .clickSignUpForFreeButton();
//        Popups.downloadAppFromStoresPopup()
//                .clickClosePopupButton();
//        Pages.userProfilePage()
//                .assertUserProfilePageOpened()
//                .assertUserIsCreatedWithEnteredName(generatedNewUserName);
    }

//    @Test
//    public void testUploadPhotoForProfileFromComputer() throws Exception {
//        Pages.userProfilePage()
//                .clickAvatarWithoutUserPhoto();
//        Popups.uploadPhotoPopup()
//                .clickAddFromComputerButton();
//        Given.generateAndSaveLocallyRandomPhoto();
//        Given.uploadGeneratedPhotoFromComputer();
//        Popups.uploadPhotoPopup()
//                .assertPhotoUploadingFinished()
//                .clickLetsGoButtonButton();
//        Selenide.refresh();
//        Pages.userProfilePage()
//                .assertAvatarContainsUserPhoto();
//    }

}