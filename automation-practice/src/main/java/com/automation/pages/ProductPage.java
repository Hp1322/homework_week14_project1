package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizeDropDown;

    @FindBy(xpath = "//ul[@id='color_to_pick_list']/li")
    WebElement colour;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCart;

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement productSuccessText;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement crossSign;

    @FindBy(xpath = "//a[@id='color_8']")
    WebElement white;

    @FindBy(xpath = "//a[@id='color_13']")
    WebElement orange;

    @FindBy(xpath = "//a[@id='color_15']")
    WebElement green;

    @FindBy(xpath = "//a[@id='color_14']")
    WebElement blue;


    public void selectSizeDropDown(String size){

        selectByVisibleTextFromDropDown(sizeDropDown, size);
    }

    public void clickOnColour() {
        Reporter.log("Clicking on colour "+ colour.toString()+ "<br>");
        clickOnElement(colour);
    }

    public void clickOnAddToCart() {
        Reporter.log("Clicking on addToCart "+ addToCart.toString()+ "<br>");
        clickOnElement(addToCart);
    }

    public String getProductSuccessText() {

        return getTextFromElement(productSuccessText);
    }

    public void clickOnCrossSign() {
        Reporter.log("Clicking on crossSign "+ crossSign.toString()+ "<br>");
        clickOnElement(crossSign);
    }

    public void clearQuantity() {
        Reporter.log("Clearing quantity "+ quantity.toString()+ "<br>");
        clearElementFromField(quantity);
    }

    public void addQuantity(String quan) {
        Reporter.log("Enter quantity "+quantity+ " to quantity field "+quantity.toString() + "<br>");
        sendTextToElement(quantity, quan);
    }

    public void selectColour(String text) {

        if (text == "White") {
            Reporter.log("Selecting colour "+text+" from dropdown "+white.toString() + "<br>");
            clickOnElement(white);
        } else if (text == "Orange") {
            Reporter.log("Selecting colour "+text+" from dropdown "+orange.toString() + "<br>");
            clickOnElement(orange);
        } else if (text == "Green") {
            Reporter.log("Selecting colour "+text+" from dropdown "+green.toString() + "<br>");
            clickOnElement(green);
        } else if (text == "Blue") {
            Reporter.log("Selecting colour "+text+" from dropdown "+blue.toString() + "<br>");
            clickOnElement(blue);
        }
    }

}

