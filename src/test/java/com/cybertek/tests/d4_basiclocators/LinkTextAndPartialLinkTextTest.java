package com.cybertek.tests.d4_basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkTextTest {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       // link text
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link = driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
        System.out.println(link.getText());

        WebElement cbt = driver.findElement(By.linkText("Cybertek School"));
        System.out.println(cbt.getText());

        // PARTIAL LINK TEXT
        WebElement link6Again = driver.findElement(By.partialLinkText("6: Loading"));
        System.out.println(link6Again.getText());

        WebElement tag = driver.findElement(By.tagName("head"));
        System.out.println(tag.getText());
        Thread.sleep(3000);
        System.out.println("gvvg");

        driver.quit();

    }
}
