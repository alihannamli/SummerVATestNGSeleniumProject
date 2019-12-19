package com.cbt.tests.d16_pom_2;

import com.cbt.Pages.DashboardPage;
import com.cbt.Pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {

    @Test
    public void verifySubTitleTest(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        String actual = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actual, "Quick Launchpad");
        // changes pages
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        // get the subtitle of the new page
        actual = dashboardPage.getPageSubTitle();
        Assert.assertEquals(actual, "Calendar Events");

        // opt + cmd + <--(arrow left)== go back to previous location of the mouse
        // opt + cmd + -->(arrow right)== come back from the place where you went back



    }

}
