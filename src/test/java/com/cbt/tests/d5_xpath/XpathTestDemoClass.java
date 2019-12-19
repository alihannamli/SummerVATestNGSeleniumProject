package com.cbt.tests.d5_xpath;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement link = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

        System.out.println(link.getText()); //Home

        WebElement link2 = driver.findElement(By.xpath("/html/body/div/div/div/div/h3"));

        System.out.println(link2.getText()); // Multiple buttons

        WebElement link3 = driver.findElement(By.xpath("//li/a "));

        System.out.println(link3.getText()); // Home

        WebElement link4 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        System.out.println(link4.getText()); // Button 1

        WebElement link5 = driver.findElement(By.xpath("//button[.='Button 1']"));

        System.out.println(link5.getText()); // Button 1

        WebElement link6 = driver.findElement(By.xpath("//*[contains(text(), 'tek Sch')]"));
        System.out.println(link6.getText()); // Cybertek School

        WebElement link7 = driver.findElement(By.xpath("//button[starts-with(@id, 'button_')]"));
        System.out.println(link7.getText()); // Button 3

        driver.quit();


    }
}
