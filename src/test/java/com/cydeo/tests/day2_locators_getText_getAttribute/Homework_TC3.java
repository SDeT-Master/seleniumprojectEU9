package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_TC3 {
    public static void main(String[] args) throws InterruptedException {
       // TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com");

        // 3- Click to Gmail from top right.
        WebElement clickToGmail=driver.findElement(By.className("gb_d"));
        clickToGmail.click();
        Thread.sleep(3000);

        //4- Verify title contains:
        // Expected: Gmail

        String actualTitle=driver.getTitle();
        String expectedTitle="Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }

        // 5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Google

        String actualTitle2=driver.getTitle();
        String expectedTitle2="Google";

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
