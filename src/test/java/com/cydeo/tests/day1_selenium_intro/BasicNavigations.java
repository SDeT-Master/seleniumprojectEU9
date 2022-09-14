package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of the selenium webdriver
        WebDriver driver=new ChromeDriver();

        // this line will maximise the browser window
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        //3- Go to tesla.com
        driver.get("https://www.tesla.com");
        String title=driver.getTitle();
        System.out.println("title = " + title);

        //get currently url using selenium
        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // stops the execution for three seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        // stops the execution for three seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        // stops the execution for three seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        // stops the execution for three seconds
        Thread.sleep(3000);

        // use navigate to method method
        driver.navigate().to("https://www.google.com");


        //get the title of the page
       // System.out.println("Title=: "+driver.getTitle());
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // this will close the currently open window
       // driver.close();

        // this will kill the current session
         driver.quit();

    }
}
