package com.cydeo.tests.day7_webtables_utilities_javafaker;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class TC2_BrowserUtility {

    //TC #2: Create utility method
    // 1. Create a new class called BrowserUtils
    //2. Create a method to make Task1 logic re-usable
    //3. When method is called, it should switch window and verify title.
    //
    //
    //Method info:
    public static void sleep(int seconds){

        seconds*=1000;

        try {

            Thread.sleep(seconds);

        }catch (InterruptedException e){

        }
    }




    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles=driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);

            System.out.println("Curren URL "+driver.getCurrentUrl() );

            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actual=driver.getTitle();
        Assert.assertEquals(actual,expectedTitle);

    }

    //• Name: switchWindowAndVerify
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedInUrl
    //• Arg3: String expectedTitle


    public static void verifyTitle(WebDriver driver,String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }


}
