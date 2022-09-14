package com.cydeo.tests.day3_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_getText_getAttribute_Practice {
    public static void main(String[] args) throws InterruptedException {
      //  TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //  1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //  3- Verify “remember me” label text is as expected:
        //  Expected: Remember me on this computer
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String actualRememberMeLabel=rememberMe.getText();
        String expectedRememberMeLabel="Remember me on this computer";
        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else {
            System.out.println("Label verification FAILED");
        }


        //  4- Verify “forgot password” link text is as expected:
        //  Expected: Forgot your password?
        WebElement forgetPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
       String actualForgotPasswordText= forgetPasswordLink.getText();
       String expectedForgotPasswordText="FORGOT YOUR PASSWORD?";

       if(actualForgotPasswordText.equals(expectedForgotPasswordText)){
           System.out.println("Forgot password link verification PASSED");
       }else {
           System.out.println(actualForgotPasswordText);
           System.out.println(expectedForgotPasswordText);

           System.out.println("Forgot password link verification FAILED");
       }


        //          5- Verify “forgot password” href attribute’s value contains expected:
        // Expected: forgot_password=yes
        String expectedInHref="forgot_password=yes";
       String actualInHref=forgetPasswordLink.getAttribute("href");

        System.out.println("actualInHref = " + actualInHref);
        System.out.println("expectedInHref = " + expectedInHref);


       if(actualInHref.contains(expectedInHref)){
           System.out.println("HERF attribute value verification PASSED");
       }else {
           System.out.println("HREF attribute value verification FAILED");
       }



        //  PS: Inspect and decide which locator you should be using to locate web
        //  elements.
        Thread.sleep(3000);
        driver.close();
    }
}
