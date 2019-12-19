package com.cbt.tests.d17_extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {

    // ExtentReports report; -> this class is used for starting and building the reports.
    ExtentReports report;
    // ExtentHtmlReporter htmlReporter; -> this is used to create the HTML report file
    ExtentHtmlReporter htmlReporter;
    // ExtentTest ExtentLogger; -> this will define a test, enables adding logs, authors, test info, etc.
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp(){
        //initialize the classes
        report = new ExtentReports();

        //create report path
        // System.out.println(System.getProperty("user.dir")); -> returns the location of my project
        String path = System.getProperty("user.dir")+ "/test-output/report.html";

        // initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        // set the title of the report
        htmlReporter.config().setReportName("Vytrack smoke tests");

        // set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("browser", "chrome");

    }

    @Test
    public void test1(){
        extentLogger = report.createTest("TC001Login as driver test");
        // info() --> write test steps
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver login info");
        extentLogger.info("click verify logged in");
        // pass() --> marks the test case as passed
        extentLogger.pass("TC001 passed");

    }

    @AfterMethod
    public void close(){
        // this is when the report is actually created
        // this line must run after everyt test(everything)
        report.flush();
    }
}
