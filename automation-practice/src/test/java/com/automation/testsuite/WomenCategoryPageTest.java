package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnWomanLink();
        softAssert.assertEquals(womenCategoryPage.getWomenText(), "WOMEN", "Not navigate to women page");
        softAssert.assertAll();

    }

    @Test(dataProvider = "selectingProduct", dataProviderClass = TestData.class,groups = {"smoke", "regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnWomanLink();
        womenCategoryPage.selectProduct(product);
        productPage.clearQuantity();
        productPage.addQuantity(qty);
        productPage.selectSizeDropDown(size);
        productPage.selectColour(colour);
        productPage.clickOnAddToCart();
        Thread.sleep(2000);
        softAssert.assertEquals(productPage.getProductSuccessText().substring(0,48), "Product successfully added to your shopping cart", "Not navigate to product page");
        productPage.clickOnCrossSign();
        softAssert.assertAll();

    }
}
