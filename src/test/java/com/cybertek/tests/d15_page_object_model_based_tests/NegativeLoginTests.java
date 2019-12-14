package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.Pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
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

    }
}
