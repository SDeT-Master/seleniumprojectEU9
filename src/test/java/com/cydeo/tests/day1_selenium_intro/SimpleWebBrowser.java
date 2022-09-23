package com.cydeo.tests.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class SimpleWebBrowser {
    WebDriver driver;
    @BeforeMethod
    public void bitfinextTest(){
       driver.get("https://www.bitfinex.com/");
    }

}
