package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dressLink;

    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDown;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement productList;


    @FindBy(xpath = "//h5//a[@title='Blouse']")
    WebElement blouse;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;

    @FindBy(xpath = "//h5//a[@title='Printed Chiffon Dress']")
    WebElement printedChiffonDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDress;


    public String getWomenText() {
        Reporter.log("getting women Text from "+womenText.toString()+"<br>");
        return getTextFromElement(womenText);
    }

    public void clickOnTopsLink() {
        Reporter.log("Clicking on topsLink "+ topsLink.toString()+ "<br>");
        clickOnElement(topsLink);
    }

    public void clickOnDressLink() {
        Reporter.log("Clicking on dressLink "+ dressLink.toString()+ "<br>");
        clickOnElement(dressLink);
    }

    public void selectSortByDropDown(String menu) {
        Reporter.log("Selecting menu "+menu+" from dropdown "+sortByDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByDropDown, menu);
    }

    public void clickOnProductList() {
        Reporter.log("Clicking on productList "+ productList.toString()+ "<br>");
        clickOnElement(productList);
    }

    public void selectProduct(String text) {

        if (text == "Blouse") {
            Reporter.log("Selecting Product "+text+" from dropdown "+blouse.toString() + "<br>");
            clickOnElement(blouse);
        } else if (text == "Printed Dress")
        {
            Reporter.log("Selecting Product "+text+" from dropdown "+printedDress.toString() + "<br>");
            clickOnElement(printedDress);
        } else if (text == "Printed Chiffon Dress")
        {
            Reporter.log("Selecting Product "+text+" from dropdown "+printedChiffonDress.toString() + "<br>");
            clickOnElement(printedChiffonDress);
        } else if (text == "Printed Summer Dress with Price $28.98")
        {
            Reporter.log("Selecting Product "+text+" from dropdown "+printedSummerDress.toString() + "<br>");
            clickOnElement(printedSummerDress);
        }
        }
    }



