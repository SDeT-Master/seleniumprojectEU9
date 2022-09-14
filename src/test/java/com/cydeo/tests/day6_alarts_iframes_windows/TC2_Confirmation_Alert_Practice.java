package com.cydeo.tests.day6_alarts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_Confirmation_Alert_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
      //  TC #2: Confirmation alert practice
        //  1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //  2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void confirmation_Alert(){
        //  3. Click to “Click for JS Confirm” button
        WebElement clickJS=driver.findElement(By.xpath("//button[2]"));
        clickJS.click();

        //  4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //  5. Verify “You clicked: Ok” text is displayed.
        WebElement buttonMessage= driver.findElement(By.xpath("//p[2]"));
        String actualText=buttonMessage.getText();
        String expectedText="You clicked: Ok";

        Assert.assertEquals(actualText,expectedText);

    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }



}
