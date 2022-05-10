package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    ProductPage productPage;
    WomenCategoryPage womenCategoryPage;
    Account account;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        productPage = new ProductPage();
        womenCategoryPage = new WomenCategoryPage();
        account = new Account();

    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnSignInLink();
        softAssert.assertEquals(signInPage.getAuthenticationText(), "AUTHENTICATION", "not navigate on AUTHENTICATION page");
        softAssert.assertAll();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) {
        homePage.clickOnSignInLink();
        signInPage.signToApplication(username,password);
        Assert.assertEquals(signInPage.getErrorMessage(),message,"Login Page not displayed");
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnSignInLink();
        signInPage.enterEmailField("ram1123@gmail.com");
        signInPage.enterPasswordField("123456");
        signInPage.clickOnSignInButton();
        softAssert.assertEquals(account.getSignOutLink(),"sign out", "not navigate to sign in page");
        softAssert.assertAll();

    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnSignInLink();
        signInPage.enterEmailField("ram1123@gmail.com");
        signInPage.enterPasswordField("123456");
        signInPage.clickOnSignInButton();
        account.clickOnSignOutLink();
        softAssert.assertEquals(homePage.verifySignInButton(),"sign in", "not navigate to page");

    }



}
