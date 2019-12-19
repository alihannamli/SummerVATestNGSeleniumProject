package com.cbt.tests.d18_data_driven_testing;

import com.cbt.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilityDemo {

    @Test
    public void readExcelTest(){

        // create an instance of the excel utility
        // argument 1: location of the file
        // argument 2: sheet we want to open\
        // when we create the object of this utility it means we opened the file and accessed certain sheet inside it
        ExcelUtil qa1Short = new ExcelUtil("src/test/resources/Vytrack testusers.xlsx", "QA1-short");
        // get number of columns
        System.out.println("Row count "+qa1Short.rowCount());
        System.out.println("Column count "+qa1Short.columnCount());
        // get all column names
        System.out.println(qa1Short.getColumnsNames());

        //get all data in list
        List<Map<String, String>> datalist = qa1Short.getDataList();

        for (Map<String, String> stringStringMap : datalist){
            System.out.println(stringStringMap);
        }

        System.out.println("++++++++++++++++++++++++++++++++");
        // get all data in 2d array
        String [][] dataArray = qa1Short.getDataArray();
        System.out.println(Arrays.deepToString(dataArray));

    }
}
