package com.cydeo.tests.day4_findElements_checkBoxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC1_xPath_cssSelector_Practice {
    public static void main(String[] args) {
        //  TC #1: XPATH and cssSelector Practices
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //        3. Locate all the WebElements on the page using XPATH and/or CSS
        //  locator only (total of 6)
        //   a. “Home” link
        // Locate homeLink using cssSelector
        //tag[attribute="value"]         a[class='nav-link']
        // . means class/ # means id
        WebElement locateHomeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        // locate homeLink using syntax number#2
        WebElement locateHomeLink_ex2=driver.findElement(By.cssSelector("a.nav-link"));
        //locate homeLink suing cssSelector, href value
        WebElement locateHomeLink_ex3=driver.findElement(By.cssSelector("a[href='/']"));


        //  b. “Forgot password” header
        //locate header using cssSelector: locate parent element and move down to h2
        WebElement locateHeader_ex1=driver.findElement(By.cssSelector("div.example>h2"));

        //Locate header using Xpath
       // WebElement locateHeader_ex2=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement locateHeader_ex2=driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //   c. “E-mail” text
        WebElement locateEmailLabel=driver.findElement(By.xpath("//label[@for='email']"));

        //   d. E-mail input box

        WebElement locateInputEmailBox_ex1=driver.findElement(By.xpath("//input[@name='email']"));
        // locate inputBox using xpath contains method

        //tagName[contains(@attribute,'value')]
        WebElement locateInputEmailBox_ex2=driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        //   e. “Retrieve password” button
        WebElement locateRetrievePasswordBtn=driver.findElement(By.xpath("//button[@id='form_submit']"));
        //  //button[@class='radius']    //button[@type='submit']


        //   f. “Powered by Cydeo text
        WebElement poweredByCydeoTextLocate=driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        // 4. Verify all web elements are displayed.
        System.out.println("locateHomeLink_ex1.isDisplayed() = " + locateHomeLink_ex1.isDisplayed());
        System.out.println("locateHeader_ex1.isDisplayed() = " + locateHeader_ex1.isDisplayed());
        System.out.println("locateEmailLabel.isDisplayed() = " + locateEmailLabel.isDisplayed());
        System.out.println("locateInputEmailBox_ex1.isDisplayed() = " + locateInputEmailBox_ex1.isDisplayed());
        System.out.println("locateRetrievePasswordBtn.isDisplayed() = " + locateRetrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoTextLocate.isDisplayed() = " + poweredByCydeoTextLocate.isDisplayed());


        //   First solve the task with using cssSelector only. Try to create 2 different
        //  cssSelector if possible

        //  Then solve the task using XPATH only. Try to create 2 different
        //   XPATH locator if possible
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.close();
    }

}
