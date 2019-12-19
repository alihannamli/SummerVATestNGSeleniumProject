package com.cbt.tests.d10_synchronization;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTests {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod()    {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //wait when trying to find the element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        //click on start
        driver.findElement(By.tagName("button")).click();
        //finding element that is not visible
        WebElement username = driver.findElement(By.id("username"));
        //create explicit wait object
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //actually waits
        //waiting for the specific element to be visible
        wait.until(ExpectedConditions.visibilityOf(username));
        //click now that element is visible
        username.sendKeys("Luis");
    }

    @Test
    public void test2TobeEnabled(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        //click enable
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        //find the input field
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));

        WebDriverWait wait = new WebDriverWait(driver, 10);

        //wait for element to be clickable/enabled
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.sendKeys("Alihan Namli");

    }

}
