package com.cybertek.tests.VyTrackATP;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * •Go to the login page of VyTrack
 * •Enter valid credential (can be any role)
 * •Click login button
 * •Verify that the user login successfully
 */
public class PositiveTestCase {

    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    driver.get("https://qa2.vytrack.com/user/login");
    Thread.sleep(1000);

        WebElement userName = driver.findElement(By.name("_username"));
        String expectedUserName = "user22";
        userName.sendKeys(expectedUserName);

        WebElement passwordInput = driver.findElement(By.name("_password"));
        String expectedPassword = "UserUser123";
        passwordInput.sendKeys(expectedPassword);

        WebElement retrievePassword = driver.findElement(By.id("_submit"));

        retrievePassword.click();


        String expectedUrl = "https://qa2.vytrack.com/";
        String actualUrl = driver.getCurrentUrl();


        if(expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualUrl : " + actualUrl);
            System.out.println("expectedUrl: " + expectedUrl);
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
