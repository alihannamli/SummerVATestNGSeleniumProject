package com.cbt.tests.d3_webelement_class;

import com.cbt.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
verify that email is displayed in the input box
click on Retrieve password
verify that confirmation message says 'Your e-mail's been sent!'
 */

public class VerifyConfirmationMessage {
    public static void main(String[] args) {
//        // set up browser
//        WebDriverManager.chromedriver().setup();
//        //open chrome browser
//        WebDriver driver = new ChromeDriver();

        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        // sendKeys --> enters given text
        String expectedEmail = "admiralkunkka@email.com";
  //      emailInput.sendKeys(expectedEmail);
        emailInput.sendKeys(expectedEmail);

        // verify that email is displayed in the input box
        //.getAttribute("value") --> get text from the input box
        String actualEmail = emailInput.getAttribute("value");

        if(expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedEmail" + expectedEmail);
            System.out.println("actualEmail" + actualEmail);
        }

        // click on Retrieve Password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage = "'Your e-mail's been sent!'";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();

        if(expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage );
        }

    }

}