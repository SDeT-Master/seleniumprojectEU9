package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_TC1 {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Etsy Title Verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        Thread.sleep(3000);


        // 3. Search for “wooden spoon”
        WebElement searchBox=driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        // 4. Verify title:
        // Expected: “Wooden spoon - Etsy”

        String actualTitle=driver.getTitle();
        String expectedTitle="Wooden spoon - Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }


        Thread.sleep(3000);
        driver.close();

    }
}
