package com.cybertek.tests.d13_WebTables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExamplesTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }

    @Test
    public void printTable(){
        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());

        Assert.assertTrue(myTable.getText().contains("jsmith@gmail.com"));
    }

    @Test
    public void getAllHeaders(){
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers size() = "+headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
        //get all column names in a single WebElement
        WebElement headers2 = driver.findElement(By.xpath("//table[@id='table1']//thead"));
        System.out.println(headers2.getText());
    }

    @Test
    public void printTableSize(){
        //numbers of colmuns
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("number of columns: "+headers.size());

        //numbers of colmuns
        List<WebElement> allRowsIncludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("numbers of rows including headers : "+allRowsIncludingHeaders);

        List<WebElement> allRowsExludingHeaders = driver.findElements(By.xpath(""))



    }
}
