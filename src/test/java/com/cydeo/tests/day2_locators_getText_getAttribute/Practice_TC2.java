package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_TC2 {
    public static void main(String[] args) throws InterruptedException {

       // TC #2: Back and forth navigation
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //  2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");


        // 3- Click to A/B Testing from top of the list.
       WebElement abTesting= driver.findElement(By.linkText("A/B Testing"));
       abTesting.click();

        //  4- Verify title is:
        //  Expected: No A/B Test
        String expectedHeader="No A/B Test";
        String actualHeader=driver.getTitle();

        if(expectedHeader.equals(actualHeader)){
            System.out.println(" Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
        Thread.sleep(3000);
        //  5- Go back to home page by using the .back();
        driver.navigate().back();
        //  6- Verify title equals:
        //  Expected: Practice

        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if(expectedHeader.equals(actualHeader)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
