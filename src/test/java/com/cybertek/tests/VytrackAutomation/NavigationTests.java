package com.cybertek.tests.VytrackAutomation;

import com.cybertek.utilities.StringUtility;
import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {

    public static void main(String[] args) {
        chrome("chrome");

    }

    public static void chrome(String browser) {

        WebDriver driver = WebDriverFactory.getDriver(browser);
        driver.get("https://google.com");
        String gtitle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String etitle = driver.getTitle();
        driver.navigate().back();
        String g2title = driver.getTitle();
        StringUtility.verifyEquals(gtitle, g2title);
        driver.navigate().forward();
        String e2title = driver.getTitle();
        StringUtility.verifyEquals(etitle, e2title);

    }

}
