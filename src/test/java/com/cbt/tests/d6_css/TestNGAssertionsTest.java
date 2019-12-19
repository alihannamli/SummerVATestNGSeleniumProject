package com.cbt.tests.d6_css;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one", "one" );

        System.out.println("second assertion");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2(){
        Assert.assertNotEquals("one", "two");
    }

    @Test
    public void test3(){
        String ExpectedTitle = "Cbt";
        String actualTitle = "Cbt";

        Assert.assertTrue(ExpectedTitle.startsWith(actualTitle));

        Assert.assertTrue("ma@cbt".contains("@"));

        Assert.assertTrue(1>0);

//        System.out.println("a".equals("a"));
    }

    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }

    @Test
    public void test5(){
        Assert.assertEquals("Cbt", "CCbt", "Title did not match");

        Assert.assertTrue("ma$cbt".contains("@"), "All emails must contains @ sign");

    }
}
