package com.cybertek.tests.day12_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCase6 {
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
        driver.get("http://google.com");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
