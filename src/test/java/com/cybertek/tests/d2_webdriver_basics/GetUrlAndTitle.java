package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {

    public static void main(String[] args) {
        // set up browser
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jetbrains.com/idea/download/");

        // get the title of the page
        String title = driver.getTitle();
        System.out.println("title = "+title);

        //get url
        String url = driver.getCurrentUrl();
        System.out.println("url = "+ url);
      //  System.out.println("url = " + url);  // soutv(sout Value)

        // getPageSource -->
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}
