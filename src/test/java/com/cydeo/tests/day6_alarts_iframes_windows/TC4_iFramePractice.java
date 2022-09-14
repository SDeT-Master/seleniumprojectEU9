package com.cydeo.tests.day6_alarts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_iFramePractice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setUpMethod(){
        // TC #4: Iframe practice
        //  1. Create a new class called: T4_Iframes
        // 1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    //@Ignore      WE USE THIS METHOD TO IGNORE TESTS

    @Test
    public void iframe_test(){

        //  4. Assert: “Your content goes here.” Text is displayed.
        // we need to switch driver's focus to iframe
        //option number 1 switching to iframe using id attribute value
       // driver.switchTo().frame("mce_0_ifr");
        // locate the p tag

        //option number 2
      //  driver.switchTo().frame(0);

        //option number 3

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//p"));


        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        // Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        // to be able to verify we must switch back to the "main frame"

        driver.switchTo().parentFrame();


        WebElement headerText=driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());





    }

}
