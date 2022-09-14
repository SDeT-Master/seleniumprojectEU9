package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) throws InterruptedException {


         //  TC #5: getText() and getAttribute() method practice
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        // 3- Verify header text is as expected:

        WebElement headerText=driver.findElement(By.tagName("h2"));// here we located header text

        String expectedHeaderText="Registration form";
        String actualHeaderText=headerText.getText(); // get text returns this Registration form"

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text verification passed");
        }else{
            System.out.println("Header text verification failed");
        }

        // Expected: Registration form



        // 4- Locate “First name” input box
        WebElement firstNameInput=driver.findElement(By.name("firstname"));




        // 5- Verify placeholder attribute’s value is as expected:

        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");

        // Expected: first name

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("PlaceHolder tect verification  PASSED");
        } else {
            System.out.println("PlaceHolder tect verification  FAILED");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
