package com.cbt.tests.d14_properties_driver_class_test_base;

import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void login(){
        String url = ConfigurationReader.get("url");
        driver.get(url);
        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
    }
}
