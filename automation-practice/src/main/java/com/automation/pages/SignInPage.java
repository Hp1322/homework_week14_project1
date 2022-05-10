package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.sql.Timestamp;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButton;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @FindBy(xpath = "//form[@id='create-account_form']")
    WebElement createAnAccountText;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailField1;

    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement errorMessage;


    public void enterEmailField(String mail) {
        Reporter.log("Enter email "+mail+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(emailField, mail);
    }

    public void enterPasswordField(String pass) {
        Reporter.log("Enter password "+pass+ " to email field "+passwordField.toString() + "<br>");
        sendTextToElement(passwordField, pass);
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on signInButton "+ signInButton.toString()+ "<br>");
        clickOnElement(signInButton);
    }

    public void clickOnCreateAnAccountButton() {
        Reporter.log("Clicking on createAnAccountButton "+ createAnAccountButton.toString()+ "<br>");
        clickOnElement(createAnAccountButton);
    }

    public String getAuthenticationText() {
        Reporter.log("getting authentication text from "+authenticationText.toString()+"<br>");
        return getTextFromElement(authenticationText);
    }

    public String getCreateAnAccountText() {
        Reporter.log("getting createAnAccount text from "+createAnAccountText.toString()+"<br>");
        return getTextFromElement(createAnAccountText);
    }

    public void enterEmailField1(String createMail) {
        Reporter.log("Enter email "+createMail+ " to email field "+emailField1.toString() + "<br>");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = createMail+timestamp.getTime()/10000+"@domain.com";
        sendTextToElement(emailField1, emailAddress);
    }

    public void signToApplication(String username, String password) {
        Reporter.log("Enter username and password "+username+" "+password+" to username and password field "+signInButton.toString() + "<br>");
        enterEmailField(username);
        enterPasswordField(password);
        clickOnSignInButton();
    }

    public String getErrorMessage() {
        Reporter.log("getting errorMessage text from "+errorMessage.toString()+"<br>");
        return getTextFromElement(errorMessage);
    }

}
