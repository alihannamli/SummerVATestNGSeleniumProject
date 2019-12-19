package com.cbt.tests.d16_pom_2;

import com.cbt.Pages.CalendarEventsPage;
import com.cbt.Pages.CreateCalendarEventsPage;
import com.cbt.Pages.DashboardPage;
import com.cbt.Pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
        BrowserUtils.waitFor(1);
        createCalendarEventsPage.repeat.click();

        // verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Repeat Every day(s) should be selected");
        //verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(), "Weekdays should not be selected");

    }

    @Test
    public void repeatOptionTest(){
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
        BrowserUtils.waitFor(1);
        createCalendarEventsPage.repeat.click();
        // verify that repeat option are Daily, Weekly, Monthly, Yearly(in that order)

        List<String > expectedList = Arrays.asList("Daily", "Weekly", "Monthly", "Yearly");

        List<WebElement>  options = createCalendarEventsPage.repeatOptionsList().getOptions();

        List<String> actualList = BrowserUtils.getElementsText(options);

        Assert.assertEquals(actualList, expectedList, "Repeat options didn't match");

    }

}
