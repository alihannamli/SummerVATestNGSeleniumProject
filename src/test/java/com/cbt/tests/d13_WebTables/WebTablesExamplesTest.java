package com.cbt.tests.d13_WebTables;

import com.cbt.utilities.WebDriverFactory;
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

        List<WebElement> allRowsExludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr"));
        System.out.println("number of rows excluding headers: "+ allRowsExludingHeaders);

    }
    @Test
    public void getRow(){
        //get any from the table using index. we will ignore the headers. 1st row is the 1st row of the body
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[1]"));
        System.out.println(row.getText());

        //get all the table row dynamically. we can do it in 2 steps
            //1. get the number rows
            // based on the number of the rows iterate each row

        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr"));
        System.out.println("number of rows excluding headers: "+ allRowsExcludingHeaders.size());

        for(int i = 0; i < allRowsExcludingHeaders.size(); i++){
            String xpath = "//table[@id='table1']/tbody//tr["+(i+1)+"]";
            System.out.println(xpath);
            WebElement singleRow = driver.findElement(By.xpath(xpath));
            System.out.println(singleRow.getText()  );

        }
    }
    @Test
    public void getAllCellInRow(){
        List<WebElement> allCellsInOneRow = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr[1]/td"));
        for (WebElement cell : allCellsInOneRow) {
            System.out.println(cell.getText());
        }
        System.out.println("number of cells in this row"+ allCellsInOneRow);
    }

    @Test
    public void getSingleCellsByIndex(){
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[1]/td[5]"));
        System.out.println(singleCell.getText());
    }

    @Test
    public void getAllCellByIndex(){
        //get number of rows
        int rowNumber = getNumberOfRows();
        //get number of columns
        int colNumber = getNumberOfCols();

        //iterates each row in the table
        for(int i = 0; i <=rowNumber; i++){

            for (int j = 0; j <= colNumber; j++){
                // i --> index of tr(row)
                //j --> index of rd(cell)
            //    String xpath = "//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]";
             //   WebElement cell = driver.findElement(By.xpath(xpath));
            //    System.out.println(cell.getText());
            }
        }

    }

    private int getNumberOfCols() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return headers.size();
    }

    //returns number of row in the body of the table. skips the table header
    private int getNumberOfRows() {
        List<WebElement> allRowsExludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRowsExludingHeaders.size();
    }

    @Test
    public void getSpecificCellByIndex(){
        //get cell by given
        int r = 1; // row number
        int c = 1; // col number

        String path = "//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]";
        WebElement cell = driver.findElement(By.xpath(path));
        System.out.println(cell.getText());

    }

    @Test
    public void getCellInRelationToAnotherLine(){

        // get eamil of Jason
        // email is in the 3rd column
        String name = "Jason";
        String xpath = "//table[@id='table1']//td[.='Jason']/../td[3]";
        System.out.println(driver.findElement(By.xpath(xpath)).getText());

    }
}
