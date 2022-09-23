package com.cydeo.tests.day7_webtables_utilities_javafaker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_LogInUtilityMethod {
    //TC #4: Create utility method
    // 1. Create a new method for login
    //2. Create a method to make Task3 logic re-usable
    //3. When method is called, it should simply login
    //
    //This method should have at least 2 overloaded versions.
    //
    //Method #1 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver
    public static void login_crm(WebDriver driver){


    }

    public static void login_crm(WebDriver driver,String userName, String password){
        WebElement inputUsername=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(userName);

        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        WebElement clickLogin=driver.findElement(By.xpath("//input[@type='submit']"));
        clickLogin.click();
    }
    //
    //
    //Method #2 info:
    //• Name: login_crm()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String username
    //• Arg3: String password
}
