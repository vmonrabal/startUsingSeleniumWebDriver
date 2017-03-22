package com.eviltester.webdriver;

import com.eviltester.webdriver.pageobject.DockerHubObject;
import com.eviltester.webdriver.pageobject.FirstPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyFirstChromeTest {

    private String dockerId = "vmonrabal";
    private String email = "vmonrabal@gmail.com";
    private String password = "pa$$Word1";

    //@Test
    public void startWebDriver(){



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

        dockerHub.registerButton.click();

        driver.close();
        driver.quit();
    }

    @Test
    public void signInDockerHubWeb(){
        // String currentDir = System.getProperty("user.dir");
        String chromeDriverLocation = "C:\\Users\\gft07\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://hub.docker.com/");
        DockerHubObject dockerHub = PageFactory.initElements(driver, DockerHubObject.class);

        dockerHub.goToLoginPageButton.click();
        dockerHub.usernameLoginInput.sendKeys(dockerId);
        dockerHub.passwordLoginInput.sendKeys(password);

        dockerHub.signInButton.click();

        driver.close();
        driver.quit();
    }
}
