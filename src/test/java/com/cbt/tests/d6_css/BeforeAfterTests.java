package com.cbt.tests.d6_css;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test1(){
        System.out.println("This is test one");
    }

    @Test
    public void test2(){
        System.out.println("This is test TWO");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING CHROME");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSING METHOD");
    }

    @BeforeClass
        public void setupClass(){
        System.out.println("BEFORE CLASS: RUNNING ONLY ONE TIME");
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("AFTER CLASS: RUNNING ONLY ONE TIME");
    }
}
