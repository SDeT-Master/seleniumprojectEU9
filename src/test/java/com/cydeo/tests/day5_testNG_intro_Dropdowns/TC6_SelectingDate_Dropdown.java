package com.cydeo.tests.day5_testNG_intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC6_SelectingDate_Dropdown {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       // TC #6: Selecting date on dropdown and verifying
        // 1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void selectingDate(){
        // 2. Go to http://practice.cydeo.com/dropdown
        driver.get("http://practice.cydeo.com/dropdown");

        // 3. Select “December 1st, 1923” and verify it is selected.

        //Select by visible TEXT
        //         Select year using  : visible text
        Select selectYear= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByVisibleText("1923");


        // Select by value
        //  Select month using   : value attribute
        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonth.selectByValue("11");


        //  Select day using : index number
        Select selectDay=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDay.selectByIndex(1);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }




}
