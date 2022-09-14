package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_TC2 {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3. Enter incorrect username
        WebElement wrongUsername=driver.findElement(By.id("email"));
        wrongUsername.sendKeys("simon.sayimu@gmail.com");

        // 4. Enter incorrect password
        WebElement wrongPassword=driver.findElement(By.id("pass"));
        wrongPassword.sendKeys("1234567890"+ Keys.ENTER);
        Thread.sleep(4000);
        //  5. Verify title changed to:
        // Expected: “Log into Facebook”

        String actualTitle= driver.getTitle();
        String expectedTitle="Log in to Facebook";

        System.out.println(actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }

        driver.close();


    }
}
