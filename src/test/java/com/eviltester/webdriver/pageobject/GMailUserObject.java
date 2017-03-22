package com.eviltester.webdriver.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by gft07 on 3/22/2017.
 */
public class GMailUserObject {

    @FindBy(xpath = "/html/body/nav/div/a[4]")
    public WebElement aCreateAccountLink;


    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    public WebElement fistNameInput;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    public WebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"GmailAddress\"]")
    public WebElement mailAdressInput;

    @FindBy(xpath = "//*[@id=\"Passwd\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"PasswdAgain\"]")
    public WebElement passwordAgainInput;

    @FindBy(xpath = "//*[@id=\"BirthDay\"]")
    public WebElement birthdayInput;

    @FindBy(xpath = "//*[@id=\"BirthMonth\"]/div")
    public WebElement birthMonthInput;

    @FindBy(xpath = "//*[@id=\":3\"]")
    public WebElement birthMonthSelected;

    @FindBy(xpath = "//*[@id=\"BirthYear\"]")
    public WebElement birthYearInput;

    @FindBy(xpath = "//*[@id=\"Gender\"]/div[1]")
    public WebElement genderInput;

    @FindBy(xpath = "//*[@id=\":f\"]/div")
    public WebElement genderSelected;

    @FindBy(xpath = "//*[@id=\"RecoveryEmailAddress\"]")
    public WebElement recoverMail;

    @FindBy(xpath = "//*[@id=\"HiddenCountryCode\"]")
    public WebElement countryCodeInput;

    @FindBy(xpath = "//*[@id=\"submitbutton\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"tos-scroll-button\"]/div/img")
    public WebElement privacyScrollButton;

    @FindBy(xpath = "//*[@id=\"iagreebutton\"]")
    public WebElement iAgreeButton;


}
