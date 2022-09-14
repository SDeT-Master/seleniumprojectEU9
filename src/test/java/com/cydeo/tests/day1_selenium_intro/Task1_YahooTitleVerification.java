package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //1 open chrome browser
        WebDriver driver=new ChromeDriver();

        // maximises the screen
        driver.manage().window().maximize();

        //2. Go to https yahoo com
        driver.get("https://www.yahoo.com");
        //3.
        String expectedTtile="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String actualTitle=driver.getTitle();

        if(expectedTtile.equals(actualTitle)){
            System.out.println("Title is as expected, Verification PASSED");
        }else{
            System.out.println("Title is NOT as expected, Verification FAILED ");
        }


        driver.close();




    }
}
