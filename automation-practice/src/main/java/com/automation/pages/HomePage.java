package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womanLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tShirtLink;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoLink;


    public void clickOnWomanLink(){
        Reporter.log("Clicking on woman "+ womanLink.toString()+ "<br>");
        clickOnElement(womanLink);
    }
    public void clickOnDressesLink(){
        Reporter.log("Clicking on dresses "+ dressesLink.toString()+ "<br>");
        clickOnElement(dressesLink);
    }
    public void clickOnTShirtLink(){
        Reporter.log("Clicking on tShirt "+ tShirtLink.toString()+ "<br>");
        clickOnElement(tShirtLink);
    }
    public void clickOnSignInLink(){
        Reporter.log("Clicking on signIn "+ signInLink.toString()+ "<br>");
        clickOnElement(signInLink);
    }
    public void clickOnLogoLink(){
        Reporter.log("Clicking on logo "+ logoLink.toString()+ "<br>");
        clickOnElement(logoLink);
    }
    public String verifySignInButton(){
        Reporter.log("verifySignInButton text from "+logoLink.toString()+"<br>");
        return getTextFromElement(logoLink);
    }



}
