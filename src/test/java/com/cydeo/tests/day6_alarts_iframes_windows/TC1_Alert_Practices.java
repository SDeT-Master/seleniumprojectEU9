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

public class TC1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

       // TC #1: Information alert practice
        // 1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }




    @Test
    public void alert_task1() throws InterruptedException {
        //  3. Click to “Click for JS Alert” button
        // . stands for text in xpath- dot stands for text in x path
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();
        Thread.sleep(2000);


        // To be able to click to Alert OK button we need to switch driver's focus to Alert itself
          Alert alert=driver.switchTo().alert();

        // 4. Click to OK button from the alert
            alert.accept();


        // 5. Verify “You successfully clicked an alert” text is displayed.
          WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));

        // Failure message will be displayed only if assertion fails:" Result text is NOT displayed;
          Assert.assertTrue(resultText.isDisplayed(),"Result text isn NOT displayed");

          String expectedTest="You successfully clicked an alert";
          String actualText= resultText.getText();


         Assert.assertEquals(actualText,expectedTest,"Actual result text is not as expected!!!");

    }

    @Test
    public void alert_task2() throws InterruptedException {
           // TC #2: Confirmation alert practice
        //  1. Open browser
        //  2. Go to website: http://practice.cydeo.com/javascript_alerts
        //  3. Click to “Click for JS Confirm” button
        WebElement clickForJSButton= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickForJSButton.click();

        //  4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();


        //   5. Verify “You clicked: Ok” text is displayed.
        WebElement verifyText= driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
        Assert.assertTrue(verifyText.isDisplayed(),"Result text is NOT displayed");
        String actualText=verifyText.getText();
        String expectedText="You clicked: Ok";

        Assert.assertEquals(actualText,expectedText,"Test FAILED");

    }

    @Test
    public void alert_task3() throws InterruptedException {
       // TC #3: Information alert practice
        //  1. Open browser
        // 2. Go to website: http://practice.cydeo.com/javascript_alerts
        // 3. Click to “Click for JS Prompt” button
        WebElement jsPromptClick= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPromptClick.click();

        // 4. Send “hello” text to alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");


        // 5. Click to OK button from the alert
        alert.accept();

        //  6. Verify “You entered:  hello” text is displayed.
        WebElement getText= driver.findElement(By.xpath("//p[@id='result']"));
        String actualText=getText.getText();
        String expectedText="You entered: hello";

        Assert.assertTrue(actualText.equals(expectedText));

    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}
