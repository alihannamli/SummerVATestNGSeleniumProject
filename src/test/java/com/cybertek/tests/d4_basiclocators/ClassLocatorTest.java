package com.cybertek.tests.d4_basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement title = driver.findElement(By.className("h3"));
        System.out.println(title.getText());

        //NEXT LINE WIL FAIL. IT IS SUPPOSED TO FAIL
        // IF CLASS has a space in it we cannot use it.

        WebElement button1 = driver.findElement(By.className("btn btn-primary"));

    }
}
