package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_TC4 {
    public static void main(String[] args) throws InterruptedException {
        //  TC #4: Library verifications
        //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://bitfinex.com/login/");

        //  3. Enter username: “incorrect@email.com”
        WebElement enterUserName=driver.findElement(By.name("username"));
        enterUserName.sendKeys("incorrect@email.com");


        //  4. Enter password: “incorrect password”
        WebElement enterPassword=driver.findElement(By.name("password"));
        enterPassword.sendKeys("incorrect password"+ Keys.ENTER);

        //   5. Verify: visually “Sorry, Wrong Email or Password”
        //   displayed


        //   PS: Locate username input box using “className” locator
        //   Locate password input box using “id” locator
        //   Locate Sign in button using “tagName” locator

        Thread.sleep(3000);
        driver.close();
    }
}
