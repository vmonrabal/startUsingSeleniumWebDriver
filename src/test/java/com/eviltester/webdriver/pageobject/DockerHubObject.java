package com.eviltester.webdriver.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by gft07 on 3/22/2017.
 */
public class DockerHubObject {

    //REGISTER PAGE
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[1]/div/input")
    public WebElement dockerId;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[2]/div/input")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[3]/div/input")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[4]/button")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"nw_login\"]")
    public WebElement goToLoginPageButton;

    //LOGIN PAGE
    @FindBy(xpath = "//*[@id=\"nw_username\"]")
    public WebElement usernameLoginInput;

    @FindBy(xpath = "//*[@id=\"nw_password\"]")
    public WebElement passwordLoginInput;

    @FindBy(xpath = "//*[@id=\"nw_submit\"]")
    public WebElement signInButton;


}
