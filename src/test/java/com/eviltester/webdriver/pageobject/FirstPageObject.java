package com.eviltester.webdriver.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by gft07 on 3/22/2017.
 */
public class FirstPageObject {

    @FindBy(xpath="//*[@id=\"post-3968\"]/header")
    public WebElement header;



}