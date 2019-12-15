package com.cybertek.tests.d16_pom_2;

import com.cybertek.Pages.CalendarEventsPage;
import com.cybertek.Pages.CreateCalendarEventsPage;
import com.cybertek.Pages.DashboardPage;
import com.cybertek.Pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatOptionsTest extends TestBase {

    @Test
    public void radioRepeatRadioButtonsTest(){
        //Login as driver
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        //go to activities -> Calendar events
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        //click on create calendar events
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        // this line is for waiting until the page load completes
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();

        // click on repeat
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        createCalendarEventsPage.repeat.click();

        // verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Repeat Every day(s) should be selected");
        //verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(), "Weekdays should not be selected");

    }

}
