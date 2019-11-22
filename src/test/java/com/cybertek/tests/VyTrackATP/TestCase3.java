package com.cybertek.tests.VyTrackATP;

//Step 1. Go to https://practice-
//cybertekschool.herokuapp.com
//Step 2. Click on “Multiple Buttons”
//Step 3. Click on “Button 1”
//Verify that result message is displayed: “Clicked on button one!”

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("firefox");

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.linkText("Multiple Buttons")).click();

        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();

        WebElement expected = driver.findElement(By.id("result"));

        String result = expected.getText();

        String actual = "Clicked on button one!";

        Assert.assertTrue(expected.isDisplayed());

        System.out.println((result.equals(actual)));

//      driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[33]/a")).click();
//
//      driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[1]")).click();
//
 //     String result = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
//      String result = driver.findElement(By.linkText("Multiple Buttons")).getText();
//
//      String expected = "Clicked on button one!";
//
//      if(expected.equals(result)) {
//          System.out.println("pass");
//      } else {
//          System.out.println("fail");
//      }
        driver.quit();
    }
}
