package com.cybertek.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String  actual) {

        //        if(expected.equals(actual)){
//            System.out.println("Passed");
//        }else{
//            System.out.println("Failed");
//        }
        String result = expected.equals(actual) ?  "Pass" : "Failed";
        System.out.println(result);
    }



}
