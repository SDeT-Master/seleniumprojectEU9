package com.cydeo.tests.day4_findElements_checkBoxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC3_xPathLocator_Practice {
    public static void main(String[] args) {


       // XPATH Practice
        // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #6:  XPATH LOCATOR practice
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        // 3. Click on Button 1
        WebElement clickButtonOne=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        clickButtonOne.click();

        // 4. Verify text displayed is as expected:
        //  Expected: “Clicked on button one!”
        // clickButtonOne.isDisplayed();

        WebElement getDisplayedText=driver.findElement(By.xpath("//p[@id='result']"));
         String actualText=  getDisplayedText.getText();
         String expectedText="Clicked on button one!";

         if(actualText.equals(expectedText)){
             System.out.println("Verification PASSED");
         }else {
             System.out.println("Verification FAILED");
         }



        //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        driver.close();
    }
}
