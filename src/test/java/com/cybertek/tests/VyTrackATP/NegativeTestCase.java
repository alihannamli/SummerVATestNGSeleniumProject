package com.cybertek.tests.VyTrackATP;

//Go to the login page of VyTrack •
// Enter invalid credential (can be any role)•
// Click login button •
// Verify that the system shows error message “Invalid user name or password.”

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NegativeTestCase {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.xpath("//*[@id=\"prependedInput\"]")).sendKeys("user2222");

        driver.findElement(By.xpath("//*[@id=\"prependedInput2\"]")).sendKeys("UserUser12345");

        driver.findElement(By.xpath("//*[@id=\"_submit\"]")).click();

        String actual = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div")).getText();

        String expected = "Invalid user name or password.";
        

        if(actual.equals(expected)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
