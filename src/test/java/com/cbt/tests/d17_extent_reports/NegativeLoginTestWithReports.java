package com.cbt.tests.d17_extent_reports;

import com.cbt.Pages.LoginPage;
import com.cbt.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports extends TestBase {

    @Test
    public void wrongPasswordTest(){

        // if we dont add  extentLogger  = report.createTest,  this test will not be in the html report
        extentLogger = report.createTest("Wrong password test");
    LoginPage loginPage = new LoginPage();
    extentLogger.info("Enter username");
    loginPage.userName.sendKeys("salesmanager101");
    extentLogger.info("Enter password");
    loginPage.password.sendKeys("sadfasdfsdffaf");
    extentLogger.info("Click submit");
    loginPage.submit.click();
    extentLogger.info("Verify page url");
    Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    extentLogger.pass("PASS: Wrong password test"); //
    }

    // test will fail
    @Test
    public void wrongUsernameTest(){

        // if we dont add  extentLogger  = report.createTest,  this test will not be in the html report
        extentLogger = report.createTest("Wrong username test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password");
        loginPage.password.sendKeys("sadfasdfsdffaf");
        extentLogger.info("Click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("PASS: Wrong username test"); //
    }


}
