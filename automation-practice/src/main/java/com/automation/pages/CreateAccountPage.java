package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleButton;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passField;

    @FindBy(xpath = "//select[@id='days']")
    WebElement daysBox;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthBox;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearBox;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterBox;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveOfferBox;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameAddress;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameAddress;

    @FindBy(xpath = "//input[@id='company']")
    WebElement companyField;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressField2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateBox;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryBox;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAddress;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    public void clickOnTitleButton() {
        Reporter.log("Clicking on title button" + titleButton.toString() + "<br>");
        clickOnElement(titleButton);
    }

    public void enterFirstName(String fName) {
        Reporter.log("Enter firstname" + fName + "to fName field " + firstName.toString() + "<br>");
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName) {
        Reporter.log("Enter lastName" + lName + "to fName field " + lastName.toString() + "<br>");
        sendTextToElement(lastName, lName);
    }

    public void enterEmail(String mail) {
        Reporter.log("Enter email" + mail + " to email field " + emailField.toString() + "<br>");
        sendTextToElement(emailField, mail);
    }

    public void enterPassWord(String pass) {
        Reporter.log("Enter passField" + pass + " to password field " + passField.toString() + "<br>");
        sendTextToElement(passField, pass);
    }

    public void selectDay(String day) {
        Reporter.log("Selecting day" + day + " from dropdown " + daysBox.toString() + "<br>");
        selectByValueFromDropDown(daysBox, day);
    }

    public void selectMonth(String month) {
        Reporter.log("Selecting month" + month + " from dropdown " + monthBox.toString() + "<br>");
        selectByValueFromDropDown(monthBox, month);
    }

    public void selectYear(String year) {
        Reporter.log("Selecting year"+year+" from dropdown "+yearBox.toString() + "<br>");
        selectByValueFromDropDown(yearBox, year);
    }

    public void clickOnNewsLetterBox() {
        Reporter.log("Clicking on newsletterbox" + newsletterBox.toString() + "<br>");
        clickOnElement(newsletterBox);
    }

    public void clickOnReceiveOfferBox() {
        Reporter.log("Clicking on receiveOfferBox"+ receiveOfferBox.toString()+ "<br>");
        clickOnElement(receiveOfferBox);
    }

    public void enterFirstNameOfAddress(String fNameAddress) {
        Reporter.log("Enter fname" + fNameAddress + " to fname field " + firstNameAddress.toString() + "<br>");
        sendTextToElement(firstNameAddress, fNameAddress);
    }

    public void enterLastNameOfAddress(String lNameAddress) {
        Reporter.log("Enter lastName" + lNameAddress + " to email field " + lastNameAddress.toString() + "<br>");
        sendTextToElement(lastNameAddress, lNameAddress);
    }

    public void enterCompanyName(String company) {
        Reporter.log("Enter company" + company + " to company field " + companyField.toString() + "<br>");
        sendTextToElement(companyField, company);
    }

    public void enterAddress1(String add1) {
        Reporter.log("Enter address" + add1 + " to email field " + addressField1.toString() + "<br>");
        sendTextToElement(addressField1, add1);
    }

    public void enterAddress2(String add2) {
        Reporter.log("Enter address" + add2 + " to email field " + addressField2.toString() + "<br>");
        sendTextToElement(addressField2, add2);
    }

    public void enterCityName(String city) {
        Reporter.log("Enter city" + city + " to city field " + cityField.toString() + "<br>");
        sendTextToElement(cityField, city);
    }

    public void selectState(String state) {
        Reporter.log("Selecting state"+state+" from dropdown "+stateBox.toString() + "<br>");
        selectByValueFromDropDown(stateBox, state);
    }

    public void enterZipCode(String zip) {
        Reporter.log("Enter zip" + zip + " to email field " + zipCode.toString() + "<br>");
        sendTextToElement(zipCode, zip);
    }

    public void selectCountry(String country) {
        Reporter.log("Selecting country "+country+" from dropdown "+countryBox.toString() + "<br>");
        selectByVisibleTextFromDropDown(countryBox, country);
    }

    public void enterHomePhone(String hPhone) {
        Reporter.log("Enter homePhone"+hPhone+ " to homePhone field "+homePhone.toString() + "<br>");
        sendTextToElement(homePhone, hPhone);
    }

    public void enterMobilePhone(String mPhone) {
        Reporter.log("Enter mPhone"+mPhone+ " to mPhone field "+mobilePhone.toString() + "<br>");
        sendTextToElement(mobilePhone, mPhone);
    }

    public void enterAssignAddress(String assign) {
        Reporter.log("Enter assignAddress "+assign+ " to assignAddress field "+assignAddress.toString() + "<br>");
        sendTextToElement(assignAddress, assign);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Clicking on registerButton"+ registerButton.toString()+ "<br>");
        clickOnElement(registerButton);
    }


}
