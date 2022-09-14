package com.cydeo.tests.day5_testNG_intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC7_SelectingValue_nonSelect {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
     //   TC #7: Selecting value from non-select dropdown
        //   1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void nonSelect(){
        //   2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //   3. Click to non-select dropdown
        WebElement nonSelectDropDown=driver.findElement
                (By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        nonSelectDropDown.click();

        //   4. Select Facebook from dropdown
        WebElement selectFacebook=driver.findElement(By.xpath("//a[@class='dropdown-item'][4]"));
        selectFacebook.click();


        //   5. Verify title is “Facebook – log in or sign up”
        String expectedTitle="Facebook – log in or sign up";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
