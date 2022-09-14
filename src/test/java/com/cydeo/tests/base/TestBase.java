package com.cydeo.tests.base;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public  abstract class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //  TC #1: Window Handle practice
        //  1. Create new test and make set ups

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void teardown(){
        driver.close();
    }

}
