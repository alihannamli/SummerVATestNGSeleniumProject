package com.cybertek.tests.VyTrackATP;

//Step 1. Go to https://practice-
//cybertekschool.herokuapp.com
//Step 2. Click on “Sign Up For Mailing List” Step 3. Enter any valid name
//Step 4. Enter any valid email
//Step 5. Click on “Sign Up” button
//Expected result: Following message should be displayed: “Thank you for signing up.
// Click the button below to return to the home page.” Home button should be displayed.

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement signUp = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[43]/a"));
        signUp.click();

        WebElement user = driver.findElement(By.name("full_name"));
        user.sendKeys("alihan");

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/input"));
        pass.sendKeys("uklimes8j@goodreads.com");

        driver.findElement(By.className("radius")).click();

        String text = driver.findElement(By.className("subheader")).getText();

        System.out.println(text);

        String actual = "Thank you for signing up. Click the button below to return to the home page.";

        if(actual.equals(text)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        driver.quit();
    }
}
