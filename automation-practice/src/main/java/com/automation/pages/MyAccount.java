package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MyAccount extends Utility {
    public MyAccount() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountText;

    public String getMyAccountText(){
        Reporter.log("getting my Account text from "+myAccountText.toString()+"<br>");
        return getTextFromElement(myAccountText);
    }
}
