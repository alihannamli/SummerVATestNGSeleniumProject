package com.cbt.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

//        Thread.sleep(1000);
//        // close() --> close the current tab/window
//        driver.close();


        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        driver.close();



//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://practice.cybertekschool.com");
//
//        Thread.sleep(1000);
//        // close(); --> close the current tab/window
//        driver.close();
//
//        //
//        driver = new ChromeDriver();
//
//        driver.get("http://practice.cybertekschool.com/open_new_tab");
//        Thread.sleep(5000);
//     //   driver.close();
//        driver.quit();


    }
}
