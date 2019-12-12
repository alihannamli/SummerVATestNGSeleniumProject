package com.cybertek.tests.day12_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase6 {
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
        driver.get("https://www.google.com/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test(){
        //go to google 1st time
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("wooden spoon"+ Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());
        driver.navigate().back();
        //go to google back
        input = driver.findElement(By.name("q"));
        input.sendKeys("books"+Keys.ENTER);

    }



}
