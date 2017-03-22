package com.eviltester.webdriver;

import com.eviltester.webdriver.pageobject.DockerHubObject;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by gft07 on 3/22/2017.
 */
public class DockerRegistrationTest {
    @Test
    public void startWebDriver(){

        String dockerId = "vmonrabal";
        String email = "vmonrabal@gmail.com";
        String password = "pa$$Word1";

        /* The following code is for the Chrome Driver
           You also need to download the ChromeDriver executable
           https://sites.google.com/a/chromium.org/chromedriver/
         */
        // String currentDir = System.getProperty("user.dir");
        String chromeDriverLocation = "C:\\Users\\gft07\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://hub.docker.com/");
        DockerHubObject dockerHub = PageFactory.initElements(driver, DockerHubObject.class);
        dockerHub.dockerId.sendKeys(dockerId);
        dockerHub.email.sendKeys(email);
        dockerHub.password.sendKeys(password);




        driver.close();
        driver.quit();
    }
}
