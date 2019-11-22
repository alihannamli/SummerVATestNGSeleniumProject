package com.cybertek.tests.d4_basiclocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.tagName("input"));
        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.tagName("input"));
        email.sendKeys("johndoe@cybertekschool.com");

        WebElement submitbutton = driver.findElement(By.tagName("button"));
        submitbutton.click();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"u_0_y\"]")).click();
        Thread.sleep(3000);
        driver.quit();
//        driver.findElement(By.id("email")).sendKeys("alihan");
//        driver.findElement(By.linkText("Forgot account?")).click();

    }
}
