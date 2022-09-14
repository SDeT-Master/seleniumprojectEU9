package com.cydeo.tests.day5_testNG_intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC8_SelectingValueFromMultipleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //  TC #8: Selecting value from multiple select dropdown
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectingValue(){
        //  2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //  3. Select all the options from multiple select dropdown.
        Select languageDropDown=new Select(driver.findElement(By.name("Languages")));

        List<WebElement> allLanguages=languageDropDown.getOptions();
        for (WebElement eachLanguage : allLanguages) {
            eachLanguage.click();

            //  4. Print out all selected values.
            System.out.println("eachLanguage.getText() = " + eachLanguage.getText());
        }


        // 5. Deselect all values.
        languageDropDown.deselectAll();

        }
        @AfterMethod
        public void tearDownMethod(){
        driver.close();
        }
    }


