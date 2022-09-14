package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_TC3 {
    public static void main(String[] args) throws InterruptedException {
       // TC#3: Google search
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com ");

        Thread.sleep(3000);
        // 3- Write “apple” in search box
        WebElement googleSearchBox=driver.findElement(By.name("q"));

        // 4- Click google search button
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        Thread.sleep(3000);

        // 5- Verify title:
        String actualTitle=driver.getTitle();
        String expectedTitle="apple";
        // Expected: Title should start with “apple” word
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
