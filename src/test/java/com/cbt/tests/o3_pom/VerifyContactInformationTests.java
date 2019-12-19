package com.cbt.tests.o3_pom;

import com.cbt.Pages.BasePage;
import com.cbt.Pages.ContactInformationPage;
import com.cbt.Pages.ContactsPage;
import com.cbt.Pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyContactInformationTests extends TestBase {

    @Test
    public void contactDetailsTest(){
        // add this test to the extent report
        extentLogger = report.createTest("Contact details test");

        // Login
        extentLogger.info("Login");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        extentLogger.info("username"+ username);
        extentLogger.info("password"+ password);
        loginPage.login(username , password);

        extentLogger.info("Go to customers -> contacts");
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.navigateToModule("Customers", "Contacts");

        // click on email mbrackstone9@example.com
        extentLogger.info("Click on email mbrackstone9@example.com");
        // wait before click on email
        contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.getContactEmail("mbrackstone9@example.com").click();

        // verify
        ContactInformationPage contactInformationPage = new ContactInformationPage();
        extentLogger.info("Verify that full name is Mariam Brackstone");
        String actualName = contactInformationPage.contactFullName.getText();
        Assert.assertEquals("Ms Mariam Brackstone", actualName);

        extentLogger.info("Verify that number phone number is 18982323434");
        String actualPhone = contactInformationPage.phone.getText();
        Assert.assertEquals(actualPhone, "+18982323434");

        extentLogger.info("Verify that email is mbrackstone9@example.com");
        String actualEmail = contactInformationPage.email.getText();
        Assert.assertEquals(actualEmail, "mbrackstone9@example.com");

    }
}
