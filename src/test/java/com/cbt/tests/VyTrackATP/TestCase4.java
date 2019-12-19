package com.cbt.tests.VyTrackATP;

//Step 1. Go to https://practice-cybertekschool.herokuapp.com
// Step 2. Click on “Registration Form”Step
// 3. Enter “123” into first name input box.Step
// 4. Verify that warning message is displayed: “first name can only consist of alphabetical letters”

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();

        WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));

        element.sendKeys("123");

        element.sendKeys(Keys.ENTER);

        String actual = driver.findElement(By.cssSelector("small[class='help-block'][data-bv-result='INVALID']")).getText();

        String expected ="first name can only consist of alphabetical letters";

        Assert.assertEquals(actual, expected);

        System.out.println(actual.equals(expected));

    }
}
