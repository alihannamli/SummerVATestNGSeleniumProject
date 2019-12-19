package com.cbt.tests.d4_basiclocators;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorsTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));

        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe@cybertekschool.com");

        WebElement submitButton = driver.findElement(By.name("wooden_spoon"));
        submitButton.click();

    }
}
