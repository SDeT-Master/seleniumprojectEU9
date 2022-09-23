package com.cydeo.tests.day7_webtables_utilities_javafaker;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TC5_VerifyTitle {

    public static void titleVerification(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
    //TC #5: Create utility method
    // 1. Create a new method for title verification
    //2. Create a method to make title verification logic re-usable
    //3. When method is called, it should simply verify expected title with actual
    //title
    //
    //
    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle
}
