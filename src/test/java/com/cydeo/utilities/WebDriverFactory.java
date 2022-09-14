package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // Task: NEW METHOD CREATION
    // Method name: getDriver
    //Static method
    //Accepts String arg: browser Type
    //- This args will determine what type of browser is opened
    //- if "chrome" passed --> it will open chrome browser
    //- if"firefox" passed --> it will open firefox browser
    // RETURN TYPE: "WebDriver"

    public static WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
           // WebDriver driver=new ChromeDriver();
            return new ChromeDriver();
        }else {
            if(browserType.equalsIgnoreCase("safari")){
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            } else {
                System.out.println("Given browser type is not accepted");
                System.out.println("Driver=null");
                return null; // if it is not either of above drivers we wil return nothing
            }
        }

    }




}
