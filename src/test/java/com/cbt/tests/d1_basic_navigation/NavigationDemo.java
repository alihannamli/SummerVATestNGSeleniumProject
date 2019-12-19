package com.cbt.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // open a website
        driver.get("http://cybertekschool.com");

        // returns the title of the page
        System.out.println(driver.getTitle());

        //this is not from selenium, it is from java
        // it pauses the program
        Thread.sleep(1000);

        driver.navigate().to("http://amazon.com/");
       // String t = driver.getTitle(); --> we could print t as well
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        // driver.navigate().back() --> goes back to previous page
        driver.navigate().back();
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        // driver.navigate().forward() --> goes forward after going back
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        // driver.navigate().refresh() --> reloads the current page
        driver.navigate().refresh();
        System.out.println(driver.getTitle());



    }
}
