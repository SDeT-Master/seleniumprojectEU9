package com.cydeo.tests.day6_alarts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_PracticeIframe {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       // TC #4: Iframe practice
        //  1. Create a new class called: T4_Iframes
        //   2. Create new test and make set ups
        //   3. Go to: https://practice.cydeo.com/iframe
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }
    @Test
    public void iframe_Practice(){
        //   4. Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
        WebElement yourContentGoesHere=driver.findElement(By.xpath("//p"));
       // System.out.println("yourContentGoesHere.getText() = " + yourContentGoesHere.getText());
        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        driver.switchTo().parentFrame();

        //   5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        WebElement iframeText= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(iframeText.isDisplayed());
    }



}
