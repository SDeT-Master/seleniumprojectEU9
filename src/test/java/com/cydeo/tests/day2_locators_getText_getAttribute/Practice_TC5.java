package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_TC5 {
    public static void main(String[] args) throws InterruptedException {

      //  TC #5: getText() and getAttribute() method practice
        //   1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //  2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


        //  3- Verify header text is as expected:
        WebElement header= driver.findElement(By.tagName("h2"));

        //  Expected: Registration form
        String expectedHeaderText="Registration form";
        String actualHeaderText=header.getText();

        if(expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }

        //   4- Locate “First name” input box
        WebElement firstNameInput=driver.findElement(By.name("firstname"));

        //  5- Verify placeholder attribute’s value is as expected:
        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");

        //  Expected: first name
       if(expectedPlaceHolder.equals(actualPlaceHolder)){
           System.out.println("Verification PASSED");
       }else {
           System.out.println("Verification FAILED");
       }

        Thread.sleep(4000);

        driver.close();
    }
}
