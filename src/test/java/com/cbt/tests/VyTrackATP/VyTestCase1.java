package com.cbt.tests.VyTrackATP;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTestCase1 {

    WebDriver driver;
    WebDriverWait wait;
    @Test
    public void Login(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);

      //  Actions action = new Actions(driver);
        WebElement activities = driver.findElement(By.linkText("Activities"));
        activities.click();
        WebElement calendarActivites = driver.findElement(By.linkText("Calendar Events"));
        wait.until(ExpectedConditions.visibilityOf(calendarActivites));
        Assert.assertTrue(driver.findElement(By.linkText("Calendar Events")).isDisplayed());



    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
