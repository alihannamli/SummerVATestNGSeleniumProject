package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.Pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest(){
        String url = ConfigurationReader.get("url");
        driver.get(url);

        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("salesmanager101");
        loginPage.password.sendKeys("sadfasdfsdffaf");
        loginPage.submit.click();

    }

    @Test
    public void wrongUsernameTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("superadminuser");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }


}
