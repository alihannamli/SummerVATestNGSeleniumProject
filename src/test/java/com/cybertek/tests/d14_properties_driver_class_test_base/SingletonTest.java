package com.cybertek.tests.d14_properties_driver_class_test_base;

import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
        //we cannot create object of that class. because Singleton constructor'u private
      //  Singleton s = new Singleton(); --> compile error.

        String s1 = Singleton.getInstance();

        String s2 = Singleton.getInstance();

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

    }

}
