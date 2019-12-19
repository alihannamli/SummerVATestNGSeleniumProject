package com.cbt.tests.VyTrackATP;

//Step 1. Go to https://practice- cybertekschool.herokuapp.com
//Step 2. Verify that number of listed examples is equals to 48.
//Hint: use findElemnts() and size()
//methods.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");

        List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li"));

        System.out.println("Listed elements amount is "+elements.size());
        System.out.println(elements.size() == 48);

        // Step 2. Verify that number of listed examples is equals to 48.
//        List<WebElement> allElements = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));
//        String a ="";
//        for(int i = 0; i < allElements.size(); i++) {
//            a = allElements.get(i).getText();
//        }
//        String[] b = a.split("\n");
////        System.out.println(Arrays.toString(b));
//        int c = b.length;
//        // System.out.println(c);
//        boolean b1 = (c==48);
//        System.out.println("Verify that number of listed examples is equals to 48 : " +b1);
    }
    }

