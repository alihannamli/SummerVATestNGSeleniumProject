package com.cybertek.tests.d14_properties_driver_class_test_base;

public class Singleton {

    // singleton class will have private constructor bcz we don't create an object
    // it means other classes cannot create an object of this class
    private Singleton(){}

    static String str;

    public static String getInstance(){
        // if str has not value, initialize it and return

        if(str==null){
            System.out.println("str is null. assigning value to it");
            str = "ice cream was good";
        }
        // else just return it
        else{
            System.out.println("it already has a value");
        }
        return str;

    }

}
