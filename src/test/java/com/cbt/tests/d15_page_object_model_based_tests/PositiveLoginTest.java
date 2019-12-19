package com.cbt.tests.d15_page_object_model_based_tests;

import com.cbt.Pages.LoginPage;
import com.cbt.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

    @Test
    public void loginAsDriver(){

        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("user2");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.vytrack.com/user/login");
    }

    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager101", "UserUser123");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.vytrack.com/user/login");
    }
}
