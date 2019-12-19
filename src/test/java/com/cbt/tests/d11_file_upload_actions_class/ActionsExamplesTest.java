package com.cbt.tests.d11_file_upload_actions_class;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ActionsExamplesTest {

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

    /*
    go to http://practice.cybertekschool.com/hovers
    hover over the first page
    verify text view profile is displayed
     */
    @Test
    public void hoverTest(){
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));

        //actions -> class contains all the user actions
        Actions actions = new Actions(driver);
        // moveToElement() -> moves the mouse on the top of the given element
        //perform() -> complete the action
        actions.moveToElement(img1).perform();
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

    }

    @Test
    public void dragdroptest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //source -> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        // target -> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(2000);
        actions.dragAndDrop(source, target).perform();

    }

    @Test
    public void dragdropbychainingtest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //source -> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        // target -> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);
        // we can chain multiple actions
        // at the end we call the build().perform();
        //build is used to chain the actions
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

    }

}
