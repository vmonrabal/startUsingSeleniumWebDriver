package com.eviltester.webdriver;

import com.eviltester.webdriver.pageobject.DockerHubObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MyFirstChromeTest {

    private String dockerId;
    private String email;
    private String password;

    WebDriver driver;

    @Before
    public void setUp(){
        dockerId = "vmonrabal";
        email = "vmonrabal@gmail.com";
        password = "pa$$Word1";

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
        driver = new ChromeDriver();
    }

    @Test
    public void startWebDriver(){

        driver.navigate().to("https://hub.docker.com/");
        DockerHubObject dockerHub = PageFactory.initElements(driver, DockerHubObject.class);
        dockerHub.dockerId.sendKeys(dockerId);
        dockerHub.email.sendKeys(email);
        dockerHub.password.sendKeys(password);

        dockerHub.registerButton.click();
    }

    @Test
    public void signInDockerHubWeb(){

        driver.navigate().to("https://hub.docker.com/");
        DockerHubObject dockerHub = PageFactory.initElements(driver, DockerHubObject.class);

        dockerHub.goToLoginPageButton.click();
        dockerHub.usernameLoginInput.sendKeys(dockerId);
        dockerHub.passwordLoginInput.sendKeys(password);

        dockerHub.signInButton.click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dockerHub.loggedName.isDisplayed();
        System.out.println(dockerHub.loggedName.getText());
        assertTrue("Login is correct", dockerHub.loggedName.getText().startsWith("vmonrabal"));
    }

    @After
    public void close(){
        driver.close();
        driver.quit();
    }
}
