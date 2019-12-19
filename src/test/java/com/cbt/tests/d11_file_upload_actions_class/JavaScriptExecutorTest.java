package com.cbt.tests.d11_file_upload_actions_class;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod()    {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //wait when trying to find the element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void click(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        //this how to JavaScriptExecutor object is created
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // executeScript --> method used to pass js command
        //first string argument is the javascript code
        js.executeScript("arguments[0].click();", element);
    }

    @Test
    public void type(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("input[disabled]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String str = "hello";

        js.executeScript("arguments[0].setAttribute('value', '" + str +"');", element);

    }
    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        for(int i = 0; i < 5 ; i++) {
        jse.executeScript("scroll(0,250);");
            Thread.sleep(2000);
        }
    }
}
