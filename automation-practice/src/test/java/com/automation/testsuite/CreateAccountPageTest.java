package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;
    CreateAccountPage createAccountPage;
    MyAccount myAccount;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        signInPage = new SignInPage();
        womenCategoryPage = new WomenCategoryPage();
        createAccountPage = new CreateAccountPage();
        myAccount = new MyAccount();

    }
    @Test(groups = {"sanity", "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnSignInLink();
        signInPage.enterEmailField1("Yogi");
        signInPage.clickOnCreateAnAccountButton();
        createAccountPage.clickOnTitleButton();
        createAccountPage.enterFirstName("Dev");
        createAccountPage.enterLastName("Raj");
        createAccountPage.enterEmail("");
        createAccountPage.enterPassWord("12345678");
        createAccountPage.selectDay("5");
        createAccountPage.selectMonth("2");
        createAccountPage.selectYear("1990");
        createAccountPage.clickOnNewsLetterBox();
        createAccountPage.clickOnReceiveOfferBox();
        createAccountPage.enterFirstNameOfAddress("");
        createAccountPage.enterLastNameOfAddress("");
        createAccountPage.enterCompanyName("abc");
        createAccountPage.enterAddress1("15, Jbl");
        createAccountPage.enterAddress2("10B");
        createAccountPage.enterCityName("Rom");
        createAccountPage.selectState("3");
        createAccountPage.enterZipCode("12345");
        createAccountPage.selectCountry("United States");
        createAccountPage.enterHomePhone("999990000");
        createAccountPage.enterMobilePhone("9898989898");
        createAccountPage.enterAssignAddress("A15,ghb");
        createAccountPage.clickOnRegisterButton();
        softAssert.assertEquals(myAccount.getMyAccountText(), "MY ACCOUNT", "not navigate to my account page");
        softAssert.assertAll();

    }
}
