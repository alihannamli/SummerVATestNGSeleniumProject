package com.cbt.tests.d14_properties_driver_class_test_base;

import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;
import org.openqa.selenium.WebDriver;
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
    @Test
    public void test2(){
        // this is how we create WebDriver object from now on
        // the type of the driver will come from the properties file
        WebDriver driver = Driver.get();

        String url = ConfigurationReader.get("url");
        driver.get(url);
        // we use this method to close the driver
        Driver.closeDriver();
    }
    @Test
    public void test3(){
        // this is how we create WebDriver object from now on
        // the type of the driver will come from the properties file

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        System.out.println(Driver.get().getTitle());
        // we use this method to close the driver
        Driver.closeDriver();

    }

}
