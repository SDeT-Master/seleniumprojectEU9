package com.cydeo.tests.day6_alarts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TC5_PracticeWindows {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       // TC #5: Window Handle practice
        // 1. Create a new class called: T5_WindowsPractice
        // 2. Create new test and make set ups
        // 3. Go to : https://practice.cydeo.com/windows
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void window_Practice(){
        // 4. Assert: Title is “Windows”
        String getWindowHandle=driver.getWindowHandle();

        Assert.assertEquals(driver.getTitle(),"Windows");

        // 5. Click to: “Click Here” link
        WebElement clickHere= driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        // 6. Switch to new Window.

        Set<String> allWindowHandles=driver.getWindowHandles();
        for (String eachWindow : driver.getWindowHandles() ) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        // 7. Assert: Title is “New Window”
        Assert.assertEquals(driver.getTitle(),"New Window");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}

