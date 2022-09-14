package com.cydeo.tests.day5_testNG_intro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test(priority = 1)
    public void test2(){
        System.out.println("Test 1 is running ");

        // compares two similar data types
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);
      //  Assert.assertEquals("actual","actual");

    }



    @Test(priority = 2)

    public void test1(){
        System.out.println("Test 2 is running ");

        //AssertTrue
        String actual="apple";
        String expected="apple";
        Assert.assertTrue(actual.equals(expected));


    }





    @BeforeClass
    public void setupMethod(){
        System.out.println("------>Before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("------>After class is running");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("-----? Before method is running");
    }


    @AfterMethod
    public void tearDownMethod(){
        System.out.println("-----> After method is running");
    }
}
