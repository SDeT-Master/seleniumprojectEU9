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

public class TC3_Prompt_Alert {


    WebDriver driver;
    @BeforeMethod
    public void setUp(){
     //   TC #3: Information alert practice
        //   1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //  2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void prompt_Alert() throws InterruptedException {
        //   3. Click to “Click for JS Prompt” button
        WebElement clickJS= driver.findElement(By.xpath("//button[3]"));
        clickJS.click();

        //  4. Send “hello” text to alert
        Thread.sleep(3000);
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("hello");


        //  5. Click to OK button from the alert
        alert.accept();

        //  6. Verify “You entered:  hello” text is displayed.
        WebElement getText= driver.findElement(By.xpath("//p[@id='result']"));
        String actualText=getText.getText();
        String expectedTest="You entered: hello";

        Assert.assertEquals(actualText,expectedTest,"Sorry try again!");


    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}
