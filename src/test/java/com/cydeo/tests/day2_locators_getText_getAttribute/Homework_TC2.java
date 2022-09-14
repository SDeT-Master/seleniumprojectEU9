package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_TC2 {
    public static void main(String[] args) {
       // TC #2: Zero Bank header verification
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

      //  3. Verify header text
        WebElement header=driver.findElement(By.tagName("h3"));
        String expectedHeaderText=header.getText();

        String actualHeaderText="Log in to ZeroBank";


       // Expected: “Log in to ZeroBank”


        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }

        driver.close();
    }
}
