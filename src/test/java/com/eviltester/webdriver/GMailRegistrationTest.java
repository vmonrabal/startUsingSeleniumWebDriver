package com.eviltester.webdriver;

import com.eviltester.webdriver.pageobject.GMailUserObject;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by gft07 on 3/22/2017.
 */
public class GMailRegistrationTest {

    ChromeDriver driver;

    GMailUserObject gmailUser;

    String firstName;
    String lastName;
    String mailAdress;
    String password;
    String birthDay;
    String birthMonth;
    String birthYear;
    String gender;
    String countryCode;

    String chromeDriverLocation;

    @Before
    public void setUp(){
        chromeDriverLocation = "C:\\Users\\gft07\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        firstName = "Vicente";
        lastName = "Monrabal";
        mailAdress = "vmonrtestmail1@gmail.com";
        password = "pa$$Word1";
        birthDay = "30";
        birthMonth = "03";
        birthYear = "1981";
        gender = "MALE";
        countryCode = "ES";
    }

    @Test
    public void gmailUserLifeCycle(){
        this.gMailUserRegister();
    }

    public void gMailUserData(){

        gmailUser = PageFactory.initElements(driver, GMailUserObject.class);

        gmailUser.fistNameInput.sendKeys(firstName);
        gmailUser.lastNameInput.sendKeys(lastName);
        gmailUser.mailAdressInput.sendKeys(mailAdress);
        gmailUser.passwordInput.sendKeys(password);
        gmailUser.passwordAgainInput.sendKeys(password);
        gmailUser.birthdayInput.sendKeys(birthDay);
        gmailUser.birthMonthInput.click();
        gmailUser.birthMonthSelected.click();
        gmailUser.birthYearInput.sendKeys(birthYear);
        gmailUser.genderInput.click();
        gmailUser.genderSelected.click();
        gmailUser.recoverMail.sendKeys("vmonrabal@gmail.com");
        //gmailUser.countryCodeInput.sendKeys(countryCode);
    }


    public void gMailUserRegister(){
        driver = new ChromeDriver();
        driver.navigate().to("https://accounts.google.com/SignUp");
        this.gMailUserData();

        gmailUser.submitButton.click();
        gmailUser.privacyScrollButton.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gmailUser.iAgreeButton.click();
        //driver.close();
        //driver.quit();
    }

    public void gMailUserLogin(){

    }



}
