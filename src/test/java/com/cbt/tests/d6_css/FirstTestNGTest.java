package com.cbt.tests.d6_css;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void test1(){
        System.out.println("this is the first test");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("this is the second test");
    }

}
