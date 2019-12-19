package com.cbt.tests.d9_tabs_frames_alerts_popups;

import com.cbt.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupAndAlerts {

    WebDriver driver; // it will be visible by every method

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void htmlPopup(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();

        driver.findElement(By.xpath("//span[.='No']")).click();

    }
    @Test
    public void jsAlerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        // trigger the second alert
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = driver.switchTo().alert();
        // dismiss --> clicking x to close, selecting no/cancel
        alert.dismiss();

        //trigger the 3rd alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("red alert");
        System.out.println(alert.getText());
        alert.accept();




    }
}
