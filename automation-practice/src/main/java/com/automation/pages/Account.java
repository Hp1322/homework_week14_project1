package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Account extends Utility {
    public Account() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutLink;

    public String getSignOutLink(){
        Reporter.log("getting signout text from "+signOutLink.toString()+"<br>");
        return getTextFromElement(signOutLink);
    }
    public void clickOnSignOutLink(){
        Reporter.log("Clicking on signOutLink"+ signOutLink.toString()+ "<br>");
        clickOnElement(signOutLink);
    }
}
