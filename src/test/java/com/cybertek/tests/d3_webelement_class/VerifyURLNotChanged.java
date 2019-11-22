package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Verify URL not changed
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password
 * click on Retrieve password
 * verify that url did not change
 */
public class VerifyURLNotChanged {

    public static void main(String[] args) {
        //open browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save the expected URL
        String expectedUrl = driver.getCurrentUrl();

// WebElement --> class that represents elements from the Webpage
        // findElement --> method used to find element on a page
        // returns a webelement
        // click on Retrieve password
        WebElement retrievePasword = driver.findElement(By.id("form_submit"));

        retrievePasword.click();

        // verify that url did not change
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

}
