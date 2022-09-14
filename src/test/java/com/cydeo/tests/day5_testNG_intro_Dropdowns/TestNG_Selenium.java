package com.cydeo.tests.day5_testNG_intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

// testng is a unit testing tool
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // Do browser driver set up
        // Open browser
       driver= WebDriverFactory.getDriver("chrome");

        // Maximise the page
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



    @Test
    public void selenium_test(){


       // Get= "http://google.com "
        driver.get("http://google.com");


        // Assert:title is "Google"
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle,"Your message will go here / Title is not matching here");

    }



}

// testNG is a unit testing tool
// selenium is a browser testing tool