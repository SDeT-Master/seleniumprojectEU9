package com.cydeo.tests.day10_upload_actions_jsexcuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC6_JavaScriptExecutor {
    @Test
    public void javascript_executor_test1(){

        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll
        // Here we are casting our driver type


        // this line below is the same as the line below it
        //JavaScript method to use : window.scrollBy(0,0)
      //  ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,750)");

        //a.  750 pixels down 10 times.
        for (int i = 0; i <10 ; i++) {

            JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");

        }



        //b.  750 pixels up 10 times
        //

        for (int i = 0; i <10 ; i++) {

            JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");

        }



    }
}
